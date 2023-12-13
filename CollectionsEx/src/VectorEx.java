import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {

		add();
		addAll();
		get();
		remove();
		size();
		clear();

	}

	private static void clear() {
		// clear():

		Vector<Character> characters = new Vector<>();
		characters.add('A');
		characters.add('B');
		characters.add('C');

		characters.clear();
		System.out.println("Vector after clearing all elements: " + characters);
	}

	private static void size() {
		// size():

		Vector<Double> prices = new Vector<>();
		prices.add(19.99);
		prices.add(29.99);
		prices.add(39.99);

		int size = prices.size();
		System.out.println("Size of the Vector: " + size);
	}

	private static void remove() {
		// remove(Object o):

		Vector<String> fruits = new Vector<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		fruits.remove("Banana");
		System.out.println("Vector after removing an element: " + fruits);
	}

	private static void get() {
		// get(int index):

		Vector<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		int elementAtIndex1 = numbers.get(1);
		System.out.println("Element at index 1: " + elementAtIndex1);
	}

	private static void addAll() {
		// addAll(Collection<? extends E> c):

		Vector<String> vector1 = new Vector<>();
		vector1.add("Apple");
		vector1.add("Banana");

		Vector<String> vector2 = new Vector<>();
		vector2.add("Orange");
		vector2.add("Grapes");

		vector1.addAll(vector2);
		System.out.println("Vector after adding all elements from another collection: " + vector1);
	}

	private static void add() {
		// add(E element):

		Vector<String> vector = new Vector<>();
		vector.add("Java");
		vector.add("Python");
		vector.add("C++");
		System.out.println("Vector after adding elements: " + vector);
	}

}
