package org.tnsif.acc.c2tc.oopsdemo;

class Calculator
{
	int add(int a, int b)
	{
		return a + b;
	}
	
	double add(double a, double b)
	{
		return a + b;
	}
	
	int add(int a, int b, int c)
	{
		return a + b + c;
	}
}

public class OverLoadingDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Two integers sum: " +calc.add(1, 3));
		System.out.println();
		System.out.println("Two double datatype sum: " +calc.add(0.6 , 3.4));
		System.out.println();
		System.out.println("Three integers sum: " +calc.add(1, 3, 3));
	}

}
