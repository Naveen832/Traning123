package Threading;

public class Synchornzatoipn1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BrickDairy BD = new BrickDairy();
		
		Runnable r1 = () -> {
			for(int i=0;i<1000;i+=50) {
				BD.incrementBrickCount();
			}
		};
		Runnable r2 = () -> {
			for(int i=0;i<1000;i+=50) {
				BD.incrementBrickCount();
			}
		};
		Runnable r3 = () -> {
			for(int i=0;i<1000;i+=50) {
				BD.incrementBrickCount();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(BD.brickCount);
		System.out.println(BD.brickCount2);
		

}
}
	 class BrickDairy{
		 int brickCount = 0;
		 int brickCount2 = 0;
//		 public synchronized void incrementBrickCount() {
//			 brickCount+=50;
//		 }
		 public void incrementBrickCount() {
			
			 synchronized(this) {
				 brickCount2+=50;
			 }
			 brickCount+=50;
		 }
		 
	 }
