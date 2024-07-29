package JAvaProgrammin;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }
	
	    public static boolean isPalindrome(String str) {
	        str = str.toLowerCase().replaceAll("[^a-z]", ""); // Convert to lowercase and remove non-alphabetic characters
	        int left = 0;
	        int right = str.length() - 1;
	
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

		self introduction
		oops real time examples with explanation
		previous project roles and responsibities
		reverse string,prime number -Promgrams
		about selenium 
		implicit wait,explicit wait
		cross browing testing
		 explaning the cucumber framework
}

