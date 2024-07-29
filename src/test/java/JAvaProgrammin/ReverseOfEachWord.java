package JAvaProgrammin;

public class ReverseOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Automation Testing";
		String rev;
		String[] str1 = str.split(" ");
		
		for(String s1 : str1) {
			rev="";
			for(int i=0;i<s1.length();i++) {
				rev=rev+s1.charAt(i);
			}
			System.out.print(rev+" ");
			
		}
		
	}

}
