package listrandomizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class AssociateCollection extends LinkedList<Associate> {

	String path = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\"
			+ "Antonio_Marrero_Code\\Revature_Week_1\\Wk1CoreJavaAssignment\\"
			+ "RandomizerApp\\src\\listrandomizer\\Associates";
	
	private static final long serialVersionUID = 1L;

	public AssociateCollection() {
		
        BufferedReader br = null;
        
        try {
        	br =  new BufferedReader(new FileReader(path));
        	String line  =  br.readLine();
        	
        	while(line != null) {
        		this.add(new Associate(line));
        		line = br.readLine();
        	}
        		br.close();
        			
        } catch(IOException ioe) {
        	
        }
	}

}
