package Threading;

public class TestMultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Thread t1 = new Thread();
//    t1.start();
//    System.out.println(t1.activeCount());
		employee e1 = new employee("T1");
		e1.start();
		System.out.println(Thread.activeCount());
		Manager m1  = new Manager("T2");
		m1.start();
		}

}
class employee extends Thread{
	public employee(String Tname) {
		super(Tname);
	}
	
	@Override
	public void run() {
		System.out.println("hello"  +  Thread.currentThread().getName());
	}
	
}
class Manager extends Thread{
	public Manager(String Tname) {
		super(Tname);
	}
	
	@Override
	public void run() {
		System.out.println("hi "+Thread.currentThread().getName());
	}
	
}

