package JAvaProgrammin;

public class ChangeSpecialCharacter {
	
	public static void main (String[] args)
    {
        String str = "Hello @Japneet";
        
       String str1 = str.replace('@', '-');
        System.out.println(str1);

       // System.out.print(printDifferentSpeicalCharacter(str));
    }

//    public static String printDifferentSpeicalCharacter(String str)
//    {
//        return str.replace('@', '_');
//    }

}
