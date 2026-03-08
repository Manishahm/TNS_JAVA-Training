package org.tnsif.acc.c2tc.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		List<Integer> numbers=new Vector<>();
		
		//add element
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		
		//access an element
		System.out.println("First number : " + numbers.get(0));
		
		//modify an elemenet
		numbers.set(1,25);
		
		//remove an element
		numbers.remove(Integer.valueOf(20));
		
		//check if element exists
		if(numbers.contains(10))
		{
			System.out.println("10 is in the list");
		}
		else
		{
			System.out.println("Required element is not in the list");
		}
		
		//print all the element
		
		for(Integer number:numbers)
		{
			System.out.println(number);
		}
		
		//get the size of the vector
		
		
		System.out.println("size of the vector :"  + numbers.size());
		
		numbers.clear();
		
		System.out.println("After clear no of numbers persent is" + numbers);
		
	}

}



