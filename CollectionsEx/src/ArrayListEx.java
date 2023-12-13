import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		get();
		addAll();
		getWithIndex();
		size();
		clear();
	}

	private static void clear() {
		//clear()
		ArrayList<Character> characters = new ArrayList<>();
		characters.add('A');
		characters.add('B');
		characters.add('C');

		characters.clear();
		System.out.println("ArrayList after clearing all elements: " + characters);
	}

	private static void size() {
		//size()
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(19.99);
		prices.add(29.99);
		prices.add(39.99);

		int size = prices.size();
		System.out.println("Size of the ArrayList: " + size);
	}
	
	public static void get() {
		//add(E element)
				ArrayList<String> list = new ArrayList<>();
				list.add("Java");
				list.add("Python");
				list.add("C++");
				System.out.println("ArrayList after adding elements: " + list);
	  }
	
	public static void addAll() {
		
		//addAll(Collection<? extends E> c)
				ArrayList<String> list1 = new ArrayList<>();
				list1.add("Apple");
				list1.add("Banana");

				ArrayList<String> list2 = new ArrayList<>();
				list2.add("Orange");
				list2.add("Grapes");

				list1.addAll(list2);
				System.out.println("ArrayList after adding all elements from another collection: " + list1);

	}
	
	public static void getWithIndex() {
		//get(int index)
				ArrayList<Integer> numbers = new ArrayList<>();
				numbers.add(10);
				numbers.add(20);
				numbers.add(30);

				int elementAtIndex1 = numbers.get(1);
				System.out.println("Element at index 1: " + elementAtIndex1);

	}
	
	public static void remove() {
		//remove(Object o)
				ArrayList<String> fruits = new ArrayList<>();
				fruits.add("Apple");
				fruits.add("Banana");
				fruits.add("Orange");

				fruits.remove("Banana");
				System.out.println("ArrayList after removing an element: " + fruits);

	}

}

  
