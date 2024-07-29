package Numbers;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenarateRandomnumstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Random r  = new Random();
//		int num=r.nextInt(5);
//		System.out.println(num);
		
		
	
	String ran=RandomStringUtils.randomNumeric(10);
	System.out.println(ran);
	String ranstr = RandomStringUtils.randomAlphabetic(10);
	System.out.println(ranstr);
	
	}

}
