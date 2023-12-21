public class YieldMethodEx extends Thread {
	
	public void run() {
		for(int i =0; i<5;i++) {
			System.out.println("From run method");
			
		}
	}
	

	public static void main(String[] args) {

			YieldMethodEx obj = new YieldMethodEx();
			obj.start();
			try {
				obj.join();//remaining threads will wait untill child thread execution completes
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i =0; i<5;i++) {
				System.out.println("From main method");
				
			}
	}

}
