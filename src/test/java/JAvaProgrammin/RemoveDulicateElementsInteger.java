package JAvaProgrammin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDulicateElementsInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]  = {12,21,33,212,33,12,34,56};
		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//			
//		}
		List l = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
			
		}
		Set L = new HashSet(l);
		System.out.println(L);
		

	}

}
