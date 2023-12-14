package com.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListEx {

	public static void main(String[] args) {
		
		
		//if the requirement is to retrive the records
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1001);
		arrayList.add(1002); //1008
		arrayList.add(1003);
		arrayList.add(1004);
		arrayList.add(1005);
		
//		System.out.println(arrayList);
		arrayList.set(4, 1008);
//		System.out.println(arrayList);
		
		//modify
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(1001);
		linkedList.add(1002); //1008
		linkedList.add(1003);
		linkedList.add(1004);
		linkedList.add(1005);
		linkedList.add(1005);
		linkedList.add(null);
		linkedList.add(null);
//		System.out.println(linkedList);
		
		Stack<Integer> stck = new Stack();
		

		stck.add(1001);
		stck.add(1002); //1008
		stck.add(1003);
		stck.add(1004);
		stck.add(1005);
		stck.add(1005);
//		stck.add(null);
//		stck.add(null);
		stck.push(1010);
		
//		System.out.println(stck);
		
		stck.pop();
		
		System.out.println(stck.peek());
		
//		System.out.println(stck);
		
		//Cursors
//		Enumeration<Integer> itr = stck.elements();
//		while(itr.hasMoreElements()) {
//			System.out.println(itr.nextElement());
//		}
		
		//remove
//		System.out.println(stck);
		Iterator<Integer> itr2 = stck.iterator();
		while(itr2.hasNext()) {
			if(itr2.next() == 1004) {
//				itr2.remove();
			}
			
			
		}
		
//		itr2.forEachRemaining(stck);
		
//		System.out.println(stck);
		
		ListIterator<Integer> itr3 = stck.listIterator();
		
		 // Traversing elements
//        System.out.println("Forward Direction Iteration:");
        while (itr3.hasNext()) {
//            System.out.println(itr3.next());
        }
 
        // Traversing elements, the iterator is at the end
        // at this point
//        System.out.println("Backward Direction Iteration:");
        while (itr3.hasPrevious()) {
//            System.out.println(itr3.previous());
        }
		
		
        
        Vector<Integer> vctr = new Vector<>();
		

        vctr.add(1001);
        vctr.add(1002); //1008
		vctr.add(1003);
		vctr.add(1004);
		vctr.add(1005);
		vctr.add(1005);
		
//		System.out.println(vctr);
//		
//		ListEx obj = new ListEx();
//		System.out.println(obj);
//		
		
		
		
		
		

	}

}
