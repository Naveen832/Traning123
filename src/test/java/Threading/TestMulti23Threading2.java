package Threading;

public class TestMulti23Threading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Thread t1 = new Thread(e1);
		t1.start();
		Manager m1 = new Manager();
		Thread t2 = new Thread(m1);
		t2.start();
		System.out.println(Thread.activeCount());
		
		}

}
class Employee implements Runnable{
	
	public void run() {
		System.out.println("hello"  +  Thread.currentThread().getName());
	}
	
}
class Manager implements Runnable{
	
	public void run() {
		System.out.println("hi "+Thread.currentThread().getName());
	
	}

}
