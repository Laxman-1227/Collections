import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//add(E element):

			
			LinkedList<String> linkedList = new LinkedList<>();
			linkedList.add("Java");
			linkedList.add("Python");
			linkedList.add("C++");
			System.out.println("LinkedList after adding elements: " + linkedList);
			
			//addAll(Collection<? extends E> c):


			LinkedList<String> list1 = new LinkedList<>();
			list1.add("Apple");
			list1.add("Banana");

			LinkedList<String> list2 = new LinkedList<>();
			list2.add("Orange");
			list2.add("Grapes");

			list1.addAll(list2);
			System.out.println("LinkedList after adding all elements from another collection: " + list1);
			
			//get(int index):

			LinkedList<Integer> numbers = new LinkedList<>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);

			int elementAtIndex1 = numbers.get(1);
			System.out.println("Element at index 1: " + elementAtIndex1);
			
			//remove(Object o):

			LinkedList<String> fruits = new LinkedList<>();
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Orange");

			fruits.remove("Banana");
			System.out.println("LinkedList after removing an element: " + fruits);
			
			//size():

			LinkedList<Double> prices = new LinkedList<>();
			prices.add(19.99);
			prices.add(29.99);
			prices.add(39.99);

			int size = prices.size();
			System.out.println("Size of the LinkedList: " + size);
			
			//clear():

			LinkedList<Character> characters = new LinkedList<>();
			characters.add('A');
			characters.add('B');
			characters.add('C');

			characters.clear();
			System.out.println("LinkedList after clearing all elements: " + characters);
			
			//addFirst(E element):

			
			
			LinkedList<String> names = new LinkedList<>();
			names.add("John");
			names.add("Alice");

			names.addFirst("Bob");
			System.out.println("LinkedList after adding element at the beginning: " + names);
			
			//addLast(E element):

			
			
			LinkedList<String> colors = new LinkedList<>();
			colors.add("Red");
			colors.add("Green");

			colors.addLast("Blue");
			System.out.println("LinkedList after adding element at the end: " + colors);
			
			//removeFirst():

			
			
			LinkedList<Integer> integers = new LinkedList<>();
			integers.add(1);
			integers.add(2);
			integers.add(3);

			integers.removeFirst();
			System.out.println("LinkedList after removing the first element: " + integers);
			
			//removeLast():

			
			
			LinkedList<String> animals = new LinkedList<>();
			animals.add("Lion");
			animals.add("Tiger");
			animals.add("Bear");

			animals.removeLast();
			System.out.println("LinkedList after removing the last element: " + animals);
	}

}
