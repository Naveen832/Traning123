package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String[] l = {"Rahul", "Utkarsh",
                 "Shubham", "Neelam"};
		 
		 
		 int a[]  = {23,43,32,4,5,32,4,5};
		 
		System.out.println( Arrays.toString(a));
		//Asending Order
		Arrays.sort(a);
		System.out.println(a);
		Arrays.parallelSort(a);
		
		System.out.println( Arrays.toString(a));
		
		
		//Printing decending order
		 
		Integer a1[]  = {23,43,32,4,5,32,4,5};
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println( Arrays.toString(a1));
		
         // Conversion of array to ArrayList
        // using Arrays.asList
		 
		
		 
		// List a1 = new ArrayList(l);
        List al = Arrays.asList(l);

          System.out.println(al);
	}

}
