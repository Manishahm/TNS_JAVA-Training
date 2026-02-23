package org.tnsif.acc.c2tc.oopsdemo;

class Student
{
	String name;
	int age;
	
	Student()
	{
		System.out.println("Default Constructor");
	}
	
	Student(String name)
	{
		this.name = name;
		System.out.println("Name: " + name);
	}
	
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student("Alice");
		Student s3 = new Student("Bob", 21);
	}

}
