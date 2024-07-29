package Numbers;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);

	        System.out.println("Enter the first Number ");
	        int a=sc.nextInt();
	        }
	        else if(b>a && b>c){
	            System.out.println("B is the Largest Number ");
	        }
	        else{
	            System.out.println("C is the Largest Number ");
	        }*/

	        //Using Ternary Operator

	        int largest1=a>b?a:b;
	        int largest2=c>largest1?c:largest1;

	        
	        System.out.println(largest1+" is the largest number");
	        System.out.println(largest2+" is the largest number");
	}

}
