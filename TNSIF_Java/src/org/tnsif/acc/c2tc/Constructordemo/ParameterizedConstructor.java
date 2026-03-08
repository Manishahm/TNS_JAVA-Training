package org.tnsif.acc.c2tc.constructordemo;

class Myclass2
{
	String color;
	int cost;
	String Brand;


	//Parameterized constructor

	Myclass2(String color,int cost,String Brand)
	{
		this.color=color;
		this.cost=cost;
		this.Brand=Brand;
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("white",200,"BMW");
		Myclass2 obj1=new Myclass2("black",400,"audi");
		System.out.println(obj.color + " " + obj.cost + "  " + obj.Brand);
		System.out.println(obj1.color + " " + obj1.cost + "  " + obj1.Brand);

	}
}

