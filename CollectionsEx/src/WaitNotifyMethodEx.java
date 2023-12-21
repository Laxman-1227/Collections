

public class WaitNotifyMethodEx{

	public static void main(String[] args) throws InterruptedException {
		
		ThreadA obj = new ThreadA(); // thread creation born
		obj.start(); //ready
		
		ThreadA obj2 = new ThreadA(); // thread creation born
		obj2.start(); 
//		obj2.wait();
		
		synchronized (obj) {
			System.out.println("main thread calling wait method");
			obj.wait();
			System.out.println("main thread got notification call");
			System.out.println(obj.total);
			
		}
	}
}

 class ThreadA extends Thread{
	 
	int total =0;
	public void run() {
		
		synchronized (this) {
			
			System.out.println("child thread starts calculation");
			for(int i=0;i<100;i++) {
				total = total+1;
			}
			
			System.out.println("child thread notification call");
			this.notify();
		}
	}

	

}


