import javax.swing.plaf.basic.BasicTableHeaderUI;

public class MyThreadEx2 {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("from MyThreadEx2 class name " + Thread.currentThread().getName());
			}

		};

		Thread t1 = new Thread(r1);
		t1.start();
 
		MyThreadEx3 obj = new MyThreadEx3();
		Thread t2 = new Thread(obj);
		t1.start();
		System.out.println("======================");

		for (int i = 0; i < 10; i++) {
			System.out.println("from main class name " + Thread.currentThread().getName());
		}
	}
}

class MyThreadEx3 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("from main class name " + Thread.currentThread().getName());
		}
	}

}
