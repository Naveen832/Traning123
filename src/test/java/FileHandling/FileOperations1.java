package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FileOperations1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
            
		
		//File f = new File("C:\\Users\\NVISWANA\\OneDrive - Capgemini\\Desktop\\TestFiles\\resume.txt");
		//File f = new File("./resume.txt");//create file
		//File f = new File("./resume1/");//create a folder in our porject
		File f = new File("C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig");
		//String  s = f.list();
		Arrays.toString(f.list());
		//System.out.println(f.mkdir());
		
//	System.out.println(f.exists());
//		System.out.println(f.createNewFile());
//		//f.delete();
		
//		if(f.exists()) {
//			f.delete();
//		}
//		else {
//			System.out.println(f.createNewFile());
//		}
//		if(f.exists()) {
//			f.delete();
//		System.out.println(f.createNewFile());
//		}
//		System.out.println(f.isHidden());//is file is hidden  or not
//		System.out.println(f.canWrite());// is file is checking to edit or not
//		f.setReadable(true);
//		System.out.println(f.canWrite());
	}

}
