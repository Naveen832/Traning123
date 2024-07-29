package Numbers;

public class EvenCountOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 23456789;
		int Evencount = 0;
		int OddCount =0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				Evencount++;
			}
			else {
				OddCount++;
			}
			num=num/10;
		}
		System.out.println("evennumber of given digit is: "+Evencount);
		System.out.println("oddnumber of given digit is: "+OddCount);
	}

}
