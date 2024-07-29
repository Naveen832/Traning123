package JAvaProgrammin;

public class CountEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The best of both worlds The best The";    
		String word = "best";
		String[] s1 = s.split(" ");
        int c = 0;   
        
        
        for(int i = 0;i<s1.length;i++) {
        	if(s1[i].equals(word)) {
        		 c++;
        	}
        	
        }
        System.out.println(c);
            
//        //Counts each character except space    
//        for(int i = 0; i < string.length(); i++) {    
//            if(string.charAt(i) != ' ')    
//                count++;    
//        }    
//            
//        //Displays the total number of characters present in the given string    
//        System.out.println("Total number of characters in a string: " + count);    
//    }    
	}

}
