package org.tnsif.acc.c2tc.exceptionhandlingdemo;



public class ThrowDemo {
	
	void validate(int age)
	{
		try {
			
	
		if(age<18)
		{
			throw new ArithmeticException("you are not Eligible to C2TC");
		}
		else
		{
			System.out.println("You are Eligible");
		}

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		ThrowDemo obj=new ThrowDemo();
		obj.validate(5);
		System.out.println("hello");

	}

}

