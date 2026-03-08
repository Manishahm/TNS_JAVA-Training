package org.tnsif.acc.c2tc.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> fruits=new LinkedList<>();
		fruits.add("Apple"); //add elements
		fruits.add("Mango");
		fruits.add("Dragon fruit");
		
		System.out.println("First fruit : " +fruits.get(0)); //access element
		
		fruits.set(1, "cherry"); //modify element
		
		fruits.remove(2);//remove element
		
		if(fruits.contains("Apple")); // check if an elem exists
		{
			System.out.println("Apple is in the list");
		}
		
		for (String fruit:fruits) {
		System.out.println(fruit);
		
		}
		
			fruits.clear();
			System.out.println("list cleared no of fruits " + fruits.size());
			System.out.println(fruits);
			
	}

}



