package org.tnsif.acc.c2tc.superkeyworddemo;

class Animal6
{
	String name="Animal";
}

class Dog6 extends Animal6
{
	String name="Dog";
	
	void displayName()
	{
		System.out.println("SuperClass name : " +super.name);
		System.out.println("SubClass name : " +name);
	}
}

public class SuperOnVariable {

	public static void main(String[] args) {
		
		Dog6 obj=new Dog6();
		obj.displayName();
	}

}


