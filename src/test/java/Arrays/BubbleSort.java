package Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {43,22,34,54};
		System.out.println(Arrays.toString(a));
		
		int n = a.length-1;
		System.out.println(n);
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
