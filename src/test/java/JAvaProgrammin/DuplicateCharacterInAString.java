package JAvaProgrammin;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String actualWord = "Dhayanidhi";
	        char[] eachChar=actualWord.toCharArray();

	        HashMap<Character,Integer> occurence=new HashMap<Character, Integer>();

	        for(char singleletter:eachChar){
	            if(occurence.containsKey(singleletter)){
	                occurence.put(singleletter,occurence.get(singleletter)+1);
	            }
	            else{
	                occurence.put(singleletter,1);
	            }
	        }

	        for (Map.Entry<Character, Integer> entry :
	                occurence.entrySet()) {

	            if (entry.getValue() == 1) {
	                System.out.println(entry.getKey()
	                        + " : "
	                        );
	}

	        }
	}
}
