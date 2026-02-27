package org.tnsif.acc.c2tc.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("Cherry");
		set.add("Banana");
		set.add("Apple");
//		set.add(null); // it will not allow ,throws an exception
		System.out.println("Treeset: " +set);
		
	}

}
