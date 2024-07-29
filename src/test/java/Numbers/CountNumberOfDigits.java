package Numbers;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 123456;
		int count = 0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count +" is the number of digits");
	}

}
