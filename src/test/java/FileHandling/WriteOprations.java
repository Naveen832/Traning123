package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOprations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("./sample.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		String s1 = "Naveen";
		//Using FileOutPutStream class
//		FileOutputStream f1 = new FileOutputStream(f);
//		for(char ch:s1.toCharArray()) {
//			f1.write((int)ch);
//		}
//		f1.write(56);
//		f1.write(465);
//		f1.write(12);
//		
//		f1.flush();
//		f1.close();
//		//Using FileWriter
//		
//		FileWriter f2 = new FileWriter(f);
//		f2.write(s1);
//		f2.close();
//		
		//Using BufferdWriter
		FileWriter f2 = new FileWriter(f);
		BufferedWriter BW = new BufferedWriter(f2);
		
		BW.write(s1);
		BW.close();
		
		
	}

}
