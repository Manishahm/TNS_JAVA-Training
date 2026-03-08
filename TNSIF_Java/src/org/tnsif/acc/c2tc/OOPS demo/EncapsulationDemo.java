package org.tnsif.acc.c2tc.oopsdemo;

class Human1
{
	private int age;
	private String name;

			public void setAge(int a)
			{
				age=a;
			}

			public int getAge()
				{
					return age;
				}
			
			public void setName(String n)
			{
				name=n;
			}
			public String getname()
			{
				return name;
			}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Human1 obj=new Human1();
		
		obj.setAge(12);
		obj.setName("Neha");
		System.out.println(obj.getAge());
		System.out.println(obj.getname());
		System.out.println();
		
		obj.setAge(17);
		obj.setName("Vishu");
		System.out.println(obj.getAge());
		System.out.println(obj.getname());

	}

}

