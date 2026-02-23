package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle
{
	void start();
	void stop();

	int Max_speed=120;

}

class Car5 implements Vehicle 
{
   private String model;
   
   
   
	public Car5(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("Car " + model +" is Staring.");
	}

	@Override
	public void stop() {
		
		System.out.println("Car " + model +" is Stoping.");
	}
	
}

class Bike implements Vehicle
{
   private String type;
   
   
   
	public Bike(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("Bike " +type+" is Staring.");
	}

	@Override
	public void stop() {
		
		System.out.println("Bike " + type+" is Stoping.");
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		Vehicle car=new Car5("KIA");
		Vehicle bike=new Bike("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("Maximun Speed of Vehicles: " +  Vehicle.Max_speed );
		

	}

}

