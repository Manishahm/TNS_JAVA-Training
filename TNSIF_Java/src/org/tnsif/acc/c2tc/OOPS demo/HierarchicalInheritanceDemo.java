package org.tnsif.acc.c2tc.oopsdemo;

class Animal2
{
	void eat()
	{
		System.out.println("Animal IS EATING ");
		System.out.println();
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking");
		System.out.println();
	}
}
class Cat extends Animal2
{
	void meow()
	{
		System.out.println("Cat is meowing");
		System.out.println();
	}
}
class Elephant extends Animal2
{
	void trumpet()
	{
		System.out.println("Elephant is trumpeting ");
		System.out.println();
	}
}


public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Dog2 dog=new Dog2 ();
		Cat cat=new Cat();
		Elephant ele=new Elephant();
		
		dog.eat();
		cat.eat();
		ele.eat();
		
		dog.bark();
		cat.meow();
		ele.trumpet();

	}

}

