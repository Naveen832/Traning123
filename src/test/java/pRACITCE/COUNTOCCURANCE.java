package pRACITCE;

import java.util.HashMap;
import java.util.Map;

public class COUNTOCCURANCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Naaveen";
		int count = 0;
		//char ch;
		char[] ch1 = s1.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
//		for(int i=0;i<s1.length();i++) {
//			ch = s1.charAt(i);
		for(char ch:ch1) {
			if(map.containsKey(ch)) {
				count = map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else {
				map.put(ch, 1);
			}
			System.out.println(map);
		}
//		for(Character key:map.keySet()) {
//			System.out.println(key+" = "+map.get(key));
//		}
	}

}
