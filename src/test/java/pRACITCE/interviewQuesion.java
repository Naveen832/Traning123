package pRACITCE;

public class interviewQuesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "fffDDeefff"; //0123456789
		char[] b = a.toCharArray();
		System.out.println(b);
		
		int count;
		
		for(int i=0;i<a.length();i++)//9
		{	
			count = 0;
			for(int j=i;j<a.length();j++)
			{				
				if(b[i]==b[j])
				{
					count++;
					
					if(j==b.length-1)
					{
						System.out.print(count+""+b[i]);
						i=j+1;
					}
				}
				else if(b[i]!=b[j])
				{
					System.out.print(count+""+b[i]);
					i=j-1;
					break;
				}	
				
			}
			
		}
		
	}

}
