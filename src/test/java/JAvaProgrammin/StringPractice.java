package JAvaProgrammin;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String x="ABCD1234abcd";
	String Cap="";
	String small="";
	String Num ="";
	for(char c :x.toCharArray()) {
		if (Character.isAlphabetic(c)) {
			int n = c;
			if (n >= 65 && n < 90) {
				Cap = Cap + c;
			} else{
				small = small + c;
			}
		}
		else {
			Num=Num+c;
		}
	}
	System.out.println(Cap);
	System.out.println(small);
	System.out.println(Num);
}

}
