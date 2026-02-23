package org.tnsif.acc.c2tc.oopsdemo;

class Human
{
	 int age;
	 String name;
}

public class BeforeEncapsulationDemo {
	
	public static void main(String[] args) {
		Human obj= new Human();
		obj.age=22;
		obj.name="Navin";
//		obj.age=23;
//		obj.name="hema";
		System.out.println(obj.age);
		System.out.println();
		System.out.println(obj.name);

	}

}

