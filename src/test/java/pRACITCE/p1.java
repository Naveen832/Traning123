package pRACITCE;

import java.util.HashMap;
import java.util.Map;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1 = "Naveene";
  char[] ch  = s1.toCharArray();
  Map<Character,Integer> map = new HashMap<Character,Integer>();
  
  for(char ch1:ch) {
	  
	  if(map.containsKey(ch1)) {
		  map.put(ch1, map.get(ch1)+1);
	  }else {
		  map.put(ch1,1);
	  }
  System.out.println(map);
  }
	}
  }