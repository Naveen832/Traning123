package JAvaProgrammin;

public class RemoveSpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@@$$%%%'';;/./ Selenium";
        String replaced=s.replaceAll("[^a-z0-9A-z]","");
        System.out.println(replaced);

        //Change special character in a string
        String s1="@Praveen";
        String replacement=s1.replace("@","");
        System.out.println(replacement);

    
	}

}
