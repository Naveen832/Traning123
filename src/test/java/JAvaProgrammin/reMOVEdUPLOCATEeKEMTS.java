package JAvaProgrammin;

import java.util.LinkedHashSet;

public class reMOVEdUPLOCATEeKEMTS {

	 public static void main (String[] args)
	    {
		 int[] a = {1,2,3,4,4,4,3,3,6,7,87,87,79};
		 LinkedHashSet<Integer> a1= new LinkedHashSet<Integer>();
		 
		 for(int i=0;i<a.length;i++) {
			 a1.add(a[i]);
		 }
		 System.out.println("after remoibnd duplicateelemts: "+a1);
		 
	    }
}
