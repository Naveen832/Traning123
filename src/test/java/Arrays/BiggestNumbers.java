package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

import org.bouncycastle.util.BigIntegers;

public class BiggestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter three numbers
	        System.out.println("Enter the first number:");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter the second number:");
	        double num2 = scanner.nextDouble();

	        System.out.println("Enter the third number:");
	        double num3 = scanner.nextDouble();

	        // Find the largest number
	        double largest = num1;

	        if (num2 > largest) {
	            largest = num2;
	        }
	        
	        if (num3 > largest) {
	            largest = num3;
	        }

	        // Print the largest number
	        System.out.println("The largest number is: " + largest); 
	}

}
