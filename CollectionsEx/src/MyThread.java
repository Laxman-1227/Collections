
class MyThread2 extends Thread{
	
	public void run() {
		
		for(int i =0; i<10;i++) {
			System.out.println("from myThread2 class name "+Thread.currentThread().getName());
		}
}
}


public class MyThread extends Thread{
	
	public void run() {
		
		for(int i =0; i<10;i++) {
			System.out.println("from MyThread class name "+Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyThread t1 = new MyThread();//thread instantiated
		t1.setName("MyOwnThread");
		t1.run(); // started
		
		MyThread2 t2 = new MyThread2();//thread instantiated
		t2.setName("MyThread2");
		t2.run(); // started
		
		for(int i=0; i<10;i++) {
			System.out.println("From main thread by "+Thread.currentThread().getName());
		}

	}

}
