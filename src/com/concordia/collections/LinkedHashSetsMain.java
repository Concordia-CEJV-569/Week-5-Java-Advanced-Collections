package com.concordia.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetsMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Tomato");
		set.add("Apple");
		set.add("Carrots");

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Tomato");
		linkedHashSet.add("Apple");
		linkedHashSet.add("Carrots");
		
//		System.out.println("Set: " + set);
		
		Iterator<String> iterator = linkedHashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Items: " + iterator.next());
		}
	}

}
