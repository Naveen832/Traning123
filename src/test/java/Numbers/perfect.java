package Numbers;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num, temp, factor = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		num = sc.nextInt();
//		temp = num;
////		while (temp != 0) {
////		temp = temp / 10;
////		factor = factor * 10;
////		}
//		System.out.print("Each digits of given number are: ");
//		while (factor > 1) {
//		factor = factor / 10;
//		System.out.print((num / factor) + " ");
//		num = num % factor;
//		}
//		}
		Scanner sc = new Scanner(System.in);
		int n, i = 1, sum = 0;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		while (i < n) {
		if (n % i == 0) {
			
		          sum = sum + i;
		}
		i++;
		}
		if (sum == n) {
		System.out.print(i + " is a perfect number");
		} else {
		System.out.print(i + " is not a perfect number");
		}
		}


	

}
