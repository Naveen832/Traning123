package JAvaProgrammin;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        String str = "pprravveenn";
		        findNonRepeatingCharacter(str);
		    }

		    private static void findNonRepeatingCharacter(String str)
		    {
		        Map<Character,Integer> map = new HashMap<Character, Integer>();


		        for(int i=0; i<str.length(); i++)
		        {
		            if(map.containsKey(str.charAt(i)))
		            {
		                map.put(str.charAt(i), map.get(str.charAt(i))+1);
		            }

		            else
		            {
		                map.put(str.charAt(i),1);
		            }
		        }
		        System.out.println(map);
	}

}
