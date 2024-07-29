package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("./text.txt");
		if(!f.exists()) {
			f.createNewFile();//create a file
       
		}
		f.delete();//delete a file
	}

}
