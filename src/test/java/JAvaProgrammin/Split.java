package JAvaProgrammin;

public class Split {
	
	
	 public static void main(String[] args) {
		 String s = "$1234asder";
     // Split the string using a regular expression to separate letters, digits, and symbols
     String[] parts = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|(?=\\W)(?=\\w)");

     // Print the result
     for (String part : parts) {
         System.out.println(part);
     }
}

}
