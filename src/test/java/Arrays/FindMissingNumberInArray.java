package Arrays;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int a[]={1,2,4,5,6};
		 int a[]={2,3,4,5,6,8};

	        int sum=0;

	        for(int i=0;i<=a.length-1;i++){
	            sum=sum+a[i];
	        }
	        System.out.println("Sum of elements in array is "+sum);

	        int sum2=0;

	        for(int i=2;i<=8;i++){
	            sum2=sum2+i;
	        }
	        System.out.println("Sum of elements in array is "+sum2);

	        System.out.println("Missing number in array is "+(sum2-sum));
	}

}
