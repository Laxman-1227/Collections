package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1001);
		list.add(1002);
		list.add(1003);
		list.add(1004);
		list.add(1005);
		list.add(1005); //duplicate
		list.add(null);
		list.add(null); //duplicate.
		
//		System.out.println(list.add(1005));
		
//		System.out.println(list);
		
		HashSet<Integer> UniqueList = new HashSet<>(list);
//		System.out.println(UniqueList);
		
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1001);
		hashSet.add(1002);
		hashSet.add(1003);
		hashSet.add(1004);
		hashSet.add(1006);
		hashSet.add(1005); //duplicate
		hashSet.add(null);
//		hashSet.add(null); //duplicate
//		System.out.println(hashSet);
		
//		System.out.println(hashSet.isEmpty());
		
//		
//		Object[] intarray =hashSet.toArray();
//		
//		
//		for (Object obj : intarray) {
//			System.out.println(obj);
//			
//			
//		}
		
//		hashSet.clear();
//		System.out.println(hashSet.contains(1005));
//		System.out.println(hashSet.containsAll(UniqueList));
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1007);
		linkedHashSet.add(1008);
		linkedHashSet.add(1009);
		linkedHashSet.add(1012);
		linkedHashSet.add(1014);
		linkedHashSet.add(1015);
		linkedHashSet.add(1016);
		linkedHashSet.add(1017);
		linkedHashSet.add(1018);
		linkedHashSet.add(1011);
		linkedHashSet.add(1008);
		linkedHashSet.add(1012);
		linkedHashSet.add(1010);
		linkedHashSet.add(null);
//		System.out.println(linkedHashSet);
		hashSet.addAll(linkedHashSet);
		
		Iterator itr = linkedHashSet.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
//		System.out.println(hashSet.addAll(linkedHashSet));
//		System.out.println(hashSet.remove(1009));
//		System.out.println(hashSet);
		
		hashSet.removeAll(linkedHashSet);
//		System.out.println(hashSet.removeIf(value -> value.equals(1004)));
		
		
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("HyD");
		treeSet.add("Hyper");
		treeSet.add("Cat");
		treeSet.add("Cot");
		treeSet.add("Dog");
		treeSet.add("Dengue");
		treeSet.add("Donkey");
		treeSet.add("Ant");
		treeSet.add("Box");
		treeSet.add("Xerox");
		treeSet.add("Tree");
//		treeSet.add(null); // not allowed
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling("C"));
		System.out.println(treeSet.first());
		System.out.println(treeSet.floor("C"));
		System.out.println(treeSet.higher("D"));
		System.out.println(treeSet.lower("D"));

		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		
		System.out.println(treeSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
