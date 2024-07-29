package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./text.txt");
		
		if(!f.exists()) 
			f.createNewFile();//create a file
		//Using FileInputStream class
//		FileInputStream fis = new FileInputStream(f); 
//		int ascicode;
//		String text = new String();
//		while((ascicode = fis.read())!=-1) {
//			text+=String.valueOf((char)ascicode);
//		     //  System.out.println((char)ascicode);
//		}
//		System.out.println();
//		System.out.println(text);
//		fis.close();
		
		//using Scanner class
//		FileInputStream fis = new FileInputStream(f); 
//		Scanner sc = new Scanner(fis);
//		String text = new String();
//		while(sc.hasNextLine()) {
//			String s  = sc.nextLine();
//			System.out.println(s);
//			
//		}
//		fis.close();
//		sc.close();
		
		//using FileReader class
//		FileReader fr = new FileReader(f);
//		int ascicode;
//		String text = new String();
//		while((ascicode = fr.read())!=-1) {
//			text+=String.valueOf((char)ascicode);
//		     //  System.out.println((char)ascicode);
//		}
//		System.out.println();
//		System.out.println(text);
//		fr.close();
		
		//UsingBufferReader class
//		FileReader fr = new FileReader(f);
//		BufferedReader br = new BufferedReader(fr);
//		int ascicode;
//		String text = new String();
//		while((ascicode = fr.read())!=-1) {
//			text+=String.valueOf((char)ascicode);
//		     //  System.out.println((char)ascicode);
//		}
//		System.out.println();
//		System.out.println(text);
//		fr.close();
//		br.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		br.close();
		

}
}
