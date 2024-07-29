package JAvaProgrammin;

import java.util.HashMap;

public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String value="aaabbccdddd";

	        HashMap<Character,Integer> map=new HashMap<Character, Integer>();

	        for(int i=0;i<value.length();i++){
	            char ch=value.charAt(i);
	            if(map.containsKey(ch)){
	                int count=map.get(ch);
	                count++;
	                map.replace(ch,count);
	            }
	            else
	            {
	                map.put(ch,1);
	            }
	        }
	        for(Character key:map.keySet()){
	            System.out.print(key+""+map.get(key));
	        }
	}

}
