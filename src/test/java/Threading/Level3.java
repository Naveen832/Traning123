package Threading;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runnable r1 = () -> {
			System.out.println("hello "+Thread.currentThread().getName());
		
		}; 
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("hello "+Thread.currentThread().getName());
			}
			};
		Thread t1 = new Thread(r1,"T1");
		Thread t2 = new Thread(r2,"T2");
		t1.start();
		t1.sleep(1000);
		t1.join();
		t2.start();
		
		
	}
}
