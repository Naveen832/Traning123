package JAvaProgrammin;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Java-Program-Java-Program-Selenium";
        String[] eachWord=s.split("-");

        HashMap<String,Integer> countOccurence=new HashMap<String, Integer>();

        for(String singleWord:eachWord){
            if(countOccurence.containsKey(singleWord)){
                countOccurence.put(singleWord,countOccurence.get(singleWord)+1);
            }
            else{
                countOccurence.put(singleWord,1);
            }
        }
        System.out.println(countOccurence);

        for(Map.Entry<String,Integer> duplicateWords:countOccurence.entrySet()){
            if(duplicateWords.getValue()>1){
                System.out.println("Key is "+duplicateWords.getKey()+" Value "+duplicateWords.getValue());
            }
        }
	}

}
