package org.tnsif.acc.c2tc.thiskeyworddemo;

class Person{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	public void displayDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
}


public class ThisDemo1 {

	public static void main(String[] args) {
		
		Person obj=new  Person();
		 obj.setName("alice");
		 obj.setAge(20);
		 obj.setName("Joel");
		 obj.setAge(30);
		 obj.getName();
		 obj.getAge();
		 obj.displayDetails();
	}

}

