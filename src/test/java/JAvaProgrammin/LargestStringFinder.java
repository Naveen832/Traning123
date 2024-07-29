package JAvaProgrammin;

import java.util.Scanner;

public class LargestStringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter three strings
	        System.out.println("Enter the first string:");
	        String str1 = scanner.nextLine();

	        System.out.println("Enter the second string:");
	        String str2 = scanner.nextLine();

	        System.out.println("Enter the third string:");
	        String str3 = scanner.nextLine();

	        // Find the largest string
	        String largest = str1;

	        if (str2.compareTo(largest) > 0) {
	            largest = str2;
	        }
	        
	        if (str3.compareTo(largest) > 0) {
	            largest = str3;
	        }

	        // Print the largest string
	        System.out.println("The largest string is: " + largest);
	}

}
