package pRACITCE;



public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "ABCDabcd1234[";
		String cap="";
		String small="";
		String num="";
		String sym="";
		char[] c1 =s1.toCharArray();
		for(char c:c1) {
		if(Character.isAlphabetic(c)) {
			int n=c;
			if(n>=65&&n<91) {
				cap=cap+c;
			}else{
				small= small+c;
			}	
			}
		else{
			num=num+c;
		}
		else if {
			sym=sym+c;
		}
		 
		}
		
		System.out.println(num);
		System.out.println(cap);
		System.out.println(small);
		System.out.println(sym);
	}

}
