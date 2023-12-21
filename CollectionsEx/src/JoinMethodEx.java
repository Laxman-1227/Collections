public class JoinMethodEx extends Thread {
	
	public void run() {
//		Thread.yield(); //thread pause
//		try {
//			Thread.sleep(5000); // to stop the thread for 5sec
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i =0; i<5;i++) {
			System.out.println("From run method");
			
		}
	}
	

	public static void main(String[] args) {

			JoinMethodEx obj = new JoinMethodEx();
			obj.start();
			
				Thread.yield();
				System.out.println(Thread.currentThread().getName());
			for(int i =0; i<5;i++) {
				System.out.println("From main method");
				
			}
	}

}
