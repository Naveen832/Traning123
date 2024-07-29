package Numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num=1234;
//		int rev = 0;
//		while(num>0) {
//			int rem = num%10;
//			rev = rev*10+rem;
//			num=num/10;
//			
//		}
//		System.out.println("reverse number is: "+rev);
//	}

	//String Byffer
	String s1 = String.valueOf(num);
   StringBuffer sb = new StringBuffer(s1);
   StringBuffer s = sb.reverse();
   System.out.println("reverse number is: "+s);
   //String Builder
//   StringBuilder s1 = new StringBuilder();
//     s1.append(num);
//     StringBuilder rev = s1.reverse();

}}
