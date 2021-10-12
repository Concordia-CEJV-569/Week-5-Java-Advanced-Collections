package com.concordia.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetsMain {

	public static void main(String[] args) {
		int studentIds[] = { 9, 3, 4, 8, 30, 6, 24, 30, 3, 4 };
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < studentIds.length; i++) {
			set.add(studentIds[i]);
		}
		
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		System.out.println("Sorted list: " + sortedSet);
		
		
		Set<Object> complexSet = new HashSet<Object>();
		complexSet.add("Tomato");
		complexSet.add("Apple");
		complexSet.add("Carrots");
		
		TreeSet<Object> sortedSet2 = new TreeSet<Object>(complexSet);
		System.out.println("Sorted list: " + sortedSet2);
		
	}

}
