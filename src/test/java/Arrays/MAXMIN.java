package Arrays;

import java.util.Arrays;

public class MAXMIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {12,32,2,112,34,433};
		            
		 Arrays.sort(a);
		 System.out.println("minimum element is: "+a[0]);
		 System.out.println("maximum element is: "+a[a.length-1]);
	}

}
