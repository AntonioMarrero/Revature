package com.revature.demos.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
 * Command line arguments used in this application:
 * 		- [File path to your target directory that you want to walk]
 * 		- .*file.* 
 * 		- ./test.zip
 */
public class IODriver {

	private String path;
	private String regex;
	private String zipFileName;
	Pattern pattern;
	List<File> zipFiles = new ArrayList<File>();

	public static void main(String[] args) {
		IODriver app = new IODriver();

		switch(Math.min(args.length, 3)) {
		case 0:
			System.out.println("USAGE: FileSearchDriver path [regex] [zipfile]");
			return;
		case 3:
			app.setZipFileName(args[2]);
		case 2:
			app.setRegex(args[1]);
		case 1:
			app.setPath(args[0]);
		}

		try {
			app.walkDirectory(app.getPath());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
		this.pattern = Pattern.compile(regex);
	}

	public String getZipFileName() {
		return zipFileName;
	}

	public void setZipFileName(String zipFileName) {
		this.zipFileName = zipFileName;
	}

	public void walkDirectory(String path) throws IOException {
		//walkDirectory_java6(path);
		//walkDirectory_java7(path);
		walkDirectory_java8(path);
		zipFiles_java7();
	}

	public void walkDirectory_java6(String path) throws IOException {
		File dir = new File(path);
		File[] files = dir.listFiles();

		for(File file : files) {
			if(file.isDirectory()) {
				walkDirectory_java6(file.getAbsolutePath());
			} else {
				processFile(file);
			}
		}
	}

	public void walkDirectory_java7(String path) throws IOException {
		Files.walkFileTree(Paths.get(path), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				processFile(file.toFile());
				return FileVisitResult.CONTINUE;
			}
		});

	}

	public void walkDirectory_java8 (String path) throws IOException {
		Files.walk(Paths.get(path)).forEach(f -> processFile(f.toFile()));
	}

	public boolean searchFile_java6(File file) throws FileNotFoundException {
		boolean found = false;
		Scanner scan = new Scanner(file, "UTF-8");

		while(scan.hasNextLine()) {
			found = searchText(scan.nextLine());
			if (found) { break; }
		}

		scan.close();
		return found;
	}

	public boolean searchFile_java7(File file) throws IOException {
		List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

		for (String line : lines) {
			if(searchText(line)) { return true; }
		}

		return false;
	}

	public boolean searchFile_java8(File file) throws IOException {
		return Files.lines(file.toPath()).anyMatch(t -> searchText(t));
	}

	public void zipFiles_java6() throws IOException {
		ZipOutputStream out = null;

		try {
			out = new ZipOutputStream(new FileOutputStream(getZipFileName()));
			File baseDir = new File(getPath());

			for (File file : zipFiles) {
				String fileName = getRelativeFilename(file, baseDir);

				ZipEntry zipEntry = new ZipEntry(fileName);
				zipEntry.setTime(file.lastModified());
				out.putNextEntry(zipEntry);

				int bufferSize = 2048;
				byte[] buffer = new byte[bufferSize];
				int len = 0;

				BufferedInputStream in = new BufferedInputStream(new FileInputStream(file), bufferSize);

				while ((len = in.read(buffer, 0, bufferSize)) != -1) {
					out.write(buffer, 0, len);;
				}
				
				in.close();
			} 
		} finally {
			out.close();
		}
	}

	public void zipFiles_java7() throws IOException {
		try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(getZipFileName()))) {
			File baseDir = new File(getPath());

			for(File file : zipFiles) {
				String fileName = getRelativeFilename(file, baseDir);

				ZipEntry zipEntry = new ZipEntry(fileName);
				zipEntry.setTime(file.lastModified());
				out.putNextEntry(zipEntry);

				Files.copy(file.toPath(), out);
				out.closeEntry();
			}
		}
	}


	public boolean searchText(String text) {
		return (this.getRegex() == null) ? true : this.pattern.matcher(text).matches();
		//return (this.getRegex() == null) ? true : this.pattern.matcher(text).find();
	}

	public void addFileToZip(File file) {
		System.out.println("addFileToZip: " + file);
		if(getZipFileName() != null) {
			zipFiles.add(file);
		}
	}

	public String getRelativeFilename(File file, File baseDir) {
		String fileName = file.getAbsolutePath().substring(baseDir.getAbsolutePath().length());
		fileName = fileName.replace('\\', '/');

		while (fileName.startsWith("/")) {
			fileName = fileName.substring(1);
		}

		return fileName;
	}

	public void processFile(File file) {
		System.out.println("processFile: " + file);

		try {
			if (searchFile_java8(file)) {
				addFileToZip(file);
			}
		} catch (IOException | UncheckedIOException ioe) {
			System.out.println("Error processing file: " + file + ": " + ioe);
		}
	}

}
