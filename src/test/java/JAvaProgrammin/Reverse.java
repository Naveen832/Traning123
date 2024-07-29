3package JAvaProgrammin;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String s = "Naveen Kumar";
		String rev = " ";
		int len = s.length()-1;
		char a[]=s.toCharArray();
		for(int i=len;i>=0;i--){
			//rev = rev+s.charAt(i);
			rev=rev+a[i];
		}
		System.out.println(rev);
		System.out.println(rev.trim());
	}

}
