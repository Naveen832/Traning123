package JAvaProgrammin;

public class PrintAllTheSubstrings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Prraavveenn";
	        printSubstrings(str);
	    }

	    private static void printSubstrings(String str)
	    {
	        for(int i=0; i<str.length(); i++)
	        {
	            for (int j=i+1; j<=str.length(); j++)
	            {
	                System.out.println(str.substring(i,j));
	            }
	        }
	}

}
