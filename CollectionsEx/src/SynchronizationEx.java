
public class SynchronizationEx extends Thread{
	Display d;
	String msg;
	
	
	
	public SynchronizationEx(Display d, String msg) {
		this.d = d;
		this.msg = msg;
	}

	public void run() {
		d.wish(msg);
	}

	public static void main(String[] args) {
		Display d = new Display();
		Display d1 = new Display();
		SynchronizationEx t1 = new SynchronizationEx(d,"RAM");
		SynchronizationEx t2 = new SynchronizationEx(d1,"Sita");
		t1.start();
		t2.start();

	}

}

class Display{
	
	public synchronized void wish(String msg) {
		
		for(int i=0;i<5;i++) {
			
			System.out.print("Good Morning :");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg);
		}
	}
}
