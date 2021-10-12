package com.concordia.collections;

import java.util.HashSet;
import java.util.Set;

public class SetsMain {

	public static void main(String[] args) {

		int studentIds[] = { 3, 4, 8, 6, 9, 24, 30, 30, 3, 4 };
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < studentIds.length; i++) {
			set.add(studentIds[i]);
		}
		
		System.out.println("Set: " + set);
		System.out.println("Size: " + set.size());
		set.remove(9);
		System.out.println("Set: " + set);
		System.out.println("Size: " + set.size());
		
		if (set.contains(9)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	}

}
