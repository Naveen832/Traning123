package Numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int orginalNum = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		if(orginalNum==rev) {
			System.out.println("it is palidrome number");
		}
		else {
			System.out.println("it is not palidrome number");
		}

	}

}
