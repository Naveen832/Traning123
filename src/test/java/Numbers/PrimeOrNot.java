package Numbers;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=11;
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			
			if(count==2) {
				System.out.println("it is prime  ");
			}
			else
			{
				System.out.println("not prime number");
			}
		}
	}


