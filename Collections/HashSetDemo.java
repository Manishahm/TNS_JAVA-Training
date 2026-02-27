package org.tnsif.acc.c2tc.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add(null);
		set.add(null);
		set.add("Apple");
		
		System.out.println("Hashset: " + set);
		
	}

}

