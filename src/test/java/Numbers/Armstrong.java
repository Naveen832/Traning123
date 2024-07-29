 package Numbers;

public class Armstrong {

	public static void main(String[] args) {
	  int n = 371;
	  int sum = 0;
	  int orginalnum = n;
	  while(n>0) {
		 int num = n%10;
		 sum+=Math.pow(num, 3);
		// sum=sum+num*num*num;
		 n=n/10;
		 
		  
	  }
	  if(orginalnum==sum) {
		  System.out.println("number is armstromng number");
	  }
	  else
	  {
		  System.out.println("not armstong numbet");
	  }
		

	}

}
