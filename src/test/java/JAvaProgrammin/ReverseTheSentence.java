package JAvaProgrammin;

public class ReverseTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello I am Praveen";
	        String [] strSplit = str.split("\\s"); //  //s means separating it by space

	        for(int i=strSplit.length-1; i>=0; i--)
	        {
	            System.out.print(strSplit[i]+" ");
	        }

	    
	}

}
