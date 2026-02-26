package org.tnsif.acc.c2tc.collections;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	String name;
	int age;
	
	
	Person(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void displayinfo()
	{
		System.out.println("Name: " + name + " , Age: "+ age);
	}


	
	//sort by name
	
	public int compareTo(Person other) {
		
		return this.name.compareTo(other.name);
	}
	
}


public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Person> people=new ArrayList<>();
		people.add(new Person("John",30));
		people.add(new Person("Anil",20));
		people.add(new Person("Baskar",17));
		people.add(new Person("Nandu",21));
		
		Collections.sort(people);
		
		for(Person person:people)
		{
			person.displayinfo();
		}

	}

}







