package org.tnsif.acc.c2tc.exceptionhandlingdemo;

import java.io.IOException;
 
public class ThrowsDemo {
	
	void m1() //No exception
	{
		System.out.println("No Exception");
	}
	//vishu
	void m2() throws IOException
	{
		System.out.println("Device error");
	}
	//Pamu sai
	void m3() throws ArithmeticException,IOException ,ClassNotFoundException
	{
		System.out.println("File not Found");
	}

	public static void main(String[] args) {
		
		ThrowsDemo obj=new ThrowsDemo();
		obj.m1();
		try {
			obj.m2();
		}catch(IOException e )
		{
			System.out.println(e);
		}
		try {
			obj.m3();
		}catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}

