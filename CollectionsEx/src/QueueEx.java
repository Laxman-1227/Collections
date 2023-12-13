import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String[] args) {
		//add(E e):

		Queue<String> queue1 = new LinkedList<>();
		queue1.add("Apple");
		queue1.add("Banana");
		queue1.add("Orange");
		System.out.println("Queue after adding elements: " + queue1);

		//offer(E e):

		Queue<Integer> queue2 = new LinkedList<>();
		queue2.offer(10);
		queue2.offer(20);
		queue2.offer(30);
		System.out.println("Queue after offering elements: " + queue2);

		//remove():

		Queue<String> queue3 = new LinkedList<>();
		queue3.add("Apple");
		queue3.add("Banana");
		queue3.add("Orange");
		String removedElement = queue3.remove();
		System.out.println("Removed element: " + removedElement);
		System.out.println("Queue after removing an element: " + queue3);

		//poll():


		Queue<Integer> queue4 = new LinkedList<>();
		queue4.offer(10);
		queue4.offer(20);
		queue4.offer(30);
		Integer polledElement = queue4.poll();
		System.out.println("Polled element: " + polledElement);
		System.out.println("Queue after polling an element: " + queue4);

		//element():


		
		Queue<String> queue5 = new LinkedList<>();
		queue5.add("Apple");
		queue5.add("Banana");
		queue5.add("Orange");
		String frontElement = queue5.element();
		System.out.println("Front element: " + frontElement);

		//peek():


		
		Queue<Integer> queue6 = new LinkedList<>();
		queue6.offer(10);
		queue6.offer(20);
		queue6.offer(30);
		Integer peekedElement = queue6.peek();
		System.out.println("Peeked element: " + peekedElement);

		
	}

}
