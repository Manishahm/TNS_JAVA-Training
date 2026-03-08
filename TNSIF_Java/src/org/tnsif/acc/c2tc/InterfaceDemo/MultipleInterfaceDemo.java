package org.tnsif.acc.c2tc.interfacedemo;

interface Printer
{
	void print(String message);
}
interface Scanner{
	void scan(String document);
}

class MultiFunction implements Printer,Scanner
{

	@Override
	public void scan(String document) {
		System.out.println("Scanning: " + document);
		
	}

	@Override
	public void print(String message) {
		System.out.println("Printing: " +message );
		
	}
	
}

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		
		MultiFunction device=new MultiFunction();
		device.scan("Demo.pdf");
		device.print("Hello World");

	}

}


