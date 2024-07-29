package JAvaProgrammin;

import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
//		 //TODO Auto-generated method stub
		String s = "Naveen";    
		int count=0;
	//	char word = 'e';
//		char[] ch1 = s.toCharArray();
//        int c = 0;   9
//        
//        
//        for(int i = 0;i<ch1.length;i++) {
//        	if(ch1[i]==word) {
//        		 c++;
//        	}
//        	
//        }
//        System.out.println(c);
            
        //Counts each character except space    
        for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) != ' ')    
                count++;    
        }    
          
        //Displays the total number of characters present in the given string    
//        System.out.println("Total number of characters in a string: " + count);    
//    }    
		String x="KiranKk";
		String s=x.toLowerCase();
		HashMap<Character,Integer> HP = new HashMap <Character,Integer>();

		for(char c :s.toCharArray()) {
			if(HP.containsKey(c)) {
 
				HP.put(c, HP.get(c)+1);
			}
			else {
				HP.put(c, 1);
			}
		}
		for(char c: HP.keySet()) {
			 System.out.println(c + ": " + HP.get(c));
		}
 
	
//	}
	}

}
