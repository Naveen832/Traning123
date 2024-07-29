 package JAvaProgrammin;

public class CountTotalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "The best of both worlds";    
        int count = 0; 
        int count2 = 0; 
        int count1 = 1;  
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')  {  
                count++;    
        }  
            
        }
        //count the nunber of strings
        for(int j=0;j<string.length()-1;j++) {
        	if((string.charAt(j)==' ') && (string.charAt(j+1)!=' ')) {
        		count1++;
        	}
        }
        String s1 = "The best of both worlds";    
        
      String c[] = s1.split(" ");
      for(String c1:c) {
    	  count2++;
      }
            
        //Counts each character except space    
        
            
        
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count); 
        System.out.println("Total number of characters in a string: " + count1);  
        System.out.println("Total number of characters in a string: " + count2);  
    }    

	}


