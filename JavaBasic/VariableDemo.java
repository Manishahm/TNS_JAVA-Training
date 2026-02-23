package org.tnsif.acc.c2tc.java_basic;

public class VariableDemo {
	
	int a = 10;//instance variable
	
	void print()
	{
		String msg = "Hello";//local variable
		 
		System.out.println(msg);
	}

	static String message = "Hello World" ;//static variable

	public static void main(String[] args) {
		
		VariableDemo obj = new VariableDemo(); 
		
		System.out.println("The value of a is "+obj.a);
		obj.print();
		System.out.println(message);

	}

}

	

