package JAvaProgrammin;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuliacateElementsStrings1 {
	
	static void removeDuplicate(char[] a,int n) {
		Set<Character> s = new LinkedHashSet<Character>();
		for (Character ch : a) {
			s.add(ch);
			
		}
		for(char x:s) {
			System.out.print(x);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    char[] a="naveen".toCharArray();
    int n = a.length;
    removeDuplicate(a,n);
	}

}
