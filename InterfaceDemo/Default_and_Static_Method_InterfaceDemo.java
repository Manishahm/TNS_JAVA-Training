package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle6
{
	void start();
	void stop();

	int Max_speed=120;
	
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static void checkMaintaince()
	{
		System.out.println("Vehicle maintaince taken care here");
	}
}

class Car6 implements Vehicle6 
{
   private String model;
   
   
   
	public Car6(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("Car " + model +" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("Car " + model +" is stoping ");
	}
	
}

class Bike6 implements Vehicle6
{
   private String type;
   
   
   
	public Bike6(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("Bike " +type+" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("Bike " + type+" is stoping ");
	}
	
}

public class Default_and_Static_Method_InterfaceDemo {

	public static void main(String[] args) {
		
		Vehicle6 car=new Car6("KIA");
		Vehicle6 bike=new Bike6("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		car.repair();
		bike.repair();
		
		Vehicle6.checkMaintaince();
		
		
		System.out.println("Maximun speed of vehicles: " +  Vehicle.Max_speed );
		
	}

}





