package JAvaProgrammin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Countoccunrance {
	
	
	static int CountOccunrance(String str,String word) {
		String[] str1=str.split(" ");
		List<String> wordlist = Arrays.asList(str1);
	//  List<String> wordlist = Arrays.asList(str.split("\\s+"));
	  
	  return Collections.frequency(wordlist,word);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str = "naveen kumar naveen";
		  String word = "naveen";
		  System.out.println(CountOccunrance(str,word));
	}

}
