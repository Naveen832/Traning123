package Threading;

public class TestMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Naveen Kumar Viswanadham");
//		String s = Thread.currentThread().getName();
//		System.out.println(s);
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getPriority());
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		Thread t4 = new Thread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		System.out.println(Thread.activeCount());
		String s = Thread.currentThread().getName();
		System.out.println(s);
	}

}
