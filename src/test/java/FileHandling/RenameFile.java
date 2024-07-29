package FileHandling;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File oldfile = new File("./sample.txt");
		File newfile = new File("./sample1.txt");
		
		if(oldfile.renameTo(newfile)) {
			System.out.println("file isn remaes");
		}
		else {
			System.out.println("not chnaged");
		}
	}

}
