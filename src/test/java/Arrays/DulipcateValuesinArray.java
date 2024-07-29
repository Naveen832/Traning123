package Arrays;

import java.util.HashSet;

public class DulipcateValuesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] s = {"c","java","python"};
		boolean flag = false;
//		for(int i=0;i<s.length;i++) {
//			for(int j=i+1;j<s.length;j++) {
//				if(s[i]==s[j]) {
//					System.out.println("found dulipciate elements: "+s[i]);
//					flag=true;
//					
//					
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("we couldnt find any duplicate value");
//		}
		
	//approch -2
	HashSet <String> set = new HashSet();
	 for(String l:s) {
		 //System.out.println(set.add(l));
		 if(set.add(l)==false) {
			 System.out.println("found the duplicate elemtns: "+l);
			 flag=true;
			 break;
		 }
	 }
	 if(flag==false) {
		 System.out.println("elemets not found");
	 }
	
	}


}
