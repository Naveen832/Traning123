package Arrays;

import java.util.Arrays;

public class BinerySerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a[]= {1,2,3,4,5,6,7,8,9,10};
		int a[]= {10,2,3,4,5,6,7,8,9,11};
		
		int key = 10;
		boolean flag = false;
  //Approach -1	
		int lB = 0;
		int HB = a.length-1;
		while(lB<=HB) {
			int mid = (lB+HB)/2;
			if(key == a[mid])
			{
				System.out.println("Element is found");
				flag = true;
				break;
			}
			if(a[mid]<key) {
				lB=mid+1;
			}
			if(a[mid]>key) {
				HB = mid-1;
			}

		}
		if(flag==false) {
			System.out.println("Element isnot fiund");
		}
		// Approacch -2
		for(int i=0;i<=a.length-1;i++) {
		if(a[i]==key) {
			System.out.println("Elemrnt is found");
			flag = true;
			break;
			
		}
		
	}
		if(flag==false) {
			System.out.println("not dounf");
		}
//		//Approach - 3
//		
//		System.out.println(Arrays.binarySearch(a, 8));

	}
}
