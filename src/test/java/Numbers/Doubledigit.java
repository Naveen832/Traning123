package Numbers;

import java.util.Scanner;

public class Doubledigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        int doubleDigit = getDoubleDigit(number);
		        if (doubleDigit != -1) {
		            System.out.println("The double digit in the number is: " + doubleDigit);
		        } else {
		            System.out.println("There is no double digit in the number.");
		        }
		    }

		    public static int getDoubleDigit(int number) {
		        while (number >= 10) {
		            int lastDigit = number % 10;
		            number /= 10;
		            if (lastDigit == number % 10) {
		                return lastDigit * 10 + lastDigit;
		            }
		        }
		        return -1;
		    }
		

	}


