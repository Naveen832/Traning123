package Arrays;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class REmoverDupilicateInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,222,444,22,555,444,33,333};
		//String s="Kiran Kumar Kiran";
		//String p[] = s.split(" ");
		//Sorting 
		Arrays.sort(a);
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[1]);
//		}
		//Remove Duplicate Integer
		List l = new ArrayList();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
			//System.out.println(l);
			Set y = new HashSet(l);
			System.out.println(y);
}

	}

