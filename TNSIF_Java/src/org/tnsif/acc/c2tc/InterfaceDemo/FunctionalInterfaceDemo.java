package org.tnsif.acc.c2tc.interfacedemo;

class GreetingsImp implements InterfaceDemo2
{

	@Override
	public void sayHello(String Name) {
		System.out.println("Hello" + "   "+ Name + " !");
		
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		InterfaceDemo2 obj=new GreetingsImp();
		obj.sayHello("Vishu");
		
	}

}

