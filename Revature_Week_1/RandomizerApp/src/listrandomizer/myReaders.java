package listrandomizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myReaders {
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		String path = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\"
				+ "Antonio_Marrero_Code\\Revature_Week_1\\Wk1CoreJavaAssignment\\"
				+ "RandomizerApp\\src\\listrandomizer\\Associates";
		
		try {
			br = new BufferedReader(new FileReader(path));
			System.out.println("Reading the file using the readLine() method:");
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
		
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
