package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapEx {

	public static void main(String[] args) {
		
		
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1001);
		hashSet.add(1002);
		hashSet.add(1003);
		hashSet.add(1004);
		hashSet.add(1006);
		hashSet.add(1005); //duplicate
		hashSet.add(null);
		
		
//		System.out.println("HashSet ::"+hashSet);
		
		
//		for(Integer str :hashSet) {
//			System.out.println(str);
//		}
//		
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add(1001);
		linkedHashSet.add(1002);
		linkedHashSet.add(1003);
		linkedHashSet.add(1004);
		linkedHashSet.add(1006);
		linkedHashSet.add(1005); //duplicate
		linkedHashSet.add(null);
		
		
//		System.out.println("linkedHashSet ::"+linkedHashSet);
		
		
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
		System.out.println("treeSet ::"+treeSet);
		
		
		System.out.println("================================================================");
		
		
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Jhon");
		map.put("Address", "Hyd");
		map.put("Phone", "0001234");
		map.put("ZipCode", "000123");
		map.put("ZipCode", "0001234");
		map.put(null, "0001234");
		map.put(null, "00012345");
		
		
		
		
//		System.out.println("HashMap ==="+map);
//		System.out.println(map.get("Name"));
//		System.out.println(map.get("ZipCode"));
//		
//		Set<String> keySet = map.keySet();
//		
//		System.out.println(keySet);
//		
//		Collection<String> values = map.values();
//		
//		System.out.println(values);
//	
//		
//		for (Map.Entry entry : map.entrySet()) {
//			System.out.println(entry.getKey() +"::"+ entry.getValue());
//			
//		}
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Name", "Jhon");
		linkedHashMap.put("Address", "Hyd");
		linkedHashMap.put("Phone", "0001234");
		linkedHashMap.put("ZipCode", "000123");
		linkedHashMap.put("ZipCode", "0001234");
		linkedHashMap.put(null, "0001234");
		linkedHashMap.put(null, "00012345");
		
//		System.out.println("linkedHashMap ::"+linkedHashMap);
		
		
		
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Name", "Jhon");
		treeMap.put("Address", "Hyd");
		treeMap.put("Phone", "0001234");
		treeMap.put("ZipCode", "000123");
		treeMap.put("ZipCode", "0001234");
//		treeMap.put(null, "0001234");
//		treeMap.put(null, "00012345");
		
		System.out.println("treeMap ::"+treeMap);
		
		
		
		
		
		
		

	}

}
