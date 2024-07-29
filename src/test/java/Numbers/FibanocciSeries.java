package Numbers;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,sum=0;
		for(int i=0;i<=13;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
