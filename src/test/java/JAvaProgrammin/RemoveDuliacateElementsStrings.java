package JAvaProgrammin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuliacateElementsStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "naveen kuamr naveen";
//		String s1[] = s.split(" ");
//		List l = new ArrayList();
//		for (int i = 0; i < s1.length; i++) {
//			l.add(s1[i]);
//			
//		}
//		Set s2 =new HashSet(l);
//		System.out.println(s2.toString());
//		}
		int i;
		String n = "Naveen";
		char[] c = n.toCharArray();
		Set<Character> s = new LinkedHashSet<Character>();
		for (Character chardata : c) {
			s.add(chardata);
			
		}
		StringBuilder sb = new StringBuilder();
		for (Character c1 : s) {
			sb.append(c1);
			
		}
		System.out.println(sb);
		}
	}


