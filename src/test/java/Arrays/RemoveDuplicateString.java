package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(4);
//		list.add(5);
////		for(int i=0;i<a.length;i++) {
////			l.add(a[i]);
////		}
//			System.out.println(list);
			//int a[]= {1,2,4,2,5,4,3};
			String s="Kiran Kumar Kiran";
			String p[] = s.split(" ");
			
			List l = new ArrayList();
			for(int i=0;i<p.length;i++) {
				l.add(p[i]);
			}
			//	System.out.println(p);
				Set y = new HashSet(l);
				System.out.println(y.toString());
//				String s="Kirank";
//				char  s1[]=s.toCharArray();
//				
//				int count=0;
//			 for(int i=0;i<=s1.length-1;i++) {
//				 for(int j=i+1;j<=s1.length-1;j++) {
//					 if(s1[i]==s1[j]) {
//						 count++;
//						 
//					 }
//				 }
//				 System.out.println(s1[i]);
//				 System.out.println(count);
//			 }
////				String p[] = s.split(" ");
////				
////				List l = new ArrayList();
////				for(int i=0;i<p.length;i++) {
////					l.add(p[i]);
////				}
////				//	System.out.println(p);
////					Set y = new HashSet(l);
////					System.out.println(y.toString());
	}
	}

