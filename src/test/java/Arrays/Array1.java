package Arrays;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[] = {12,34,32,4,53,123};
 System.out.println(a[1]);
 System.out.println(Arrays.toString(a));
 Arrays.sort(a);
 System.out.println(a);
 for(int i=0;i<=a.length-1;i++) {
	 System.out.println(a[i]);
 }
 for(int i=1;i< a.length;i++) {
	 System.out.println(a[i]);
 }
	}


}
