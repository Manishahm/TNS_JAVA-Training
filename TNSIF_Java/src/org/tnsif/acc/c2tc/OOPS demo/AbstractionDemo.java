package org.tnsif.acc.c2tc.oopsdemo;

public class AbstractionDemo {

	public static void main(String[] args) {
		MaheshDemo mahesh = new SureshDemo();
        mahesh.calling();
        mahesh.AIIntegration();
        mahesh.SatelliteConn();
        mahesh.HealthMonitoring();

	}

}

abstract class MaheshDemo   //2024 abstract class
{
    public void calling()   //concrete method
    {
        System.out.println("Calling");
    }
    public abstract void AIIntegration();  //abstract method
    public abstract void SatelliteConn();
    public abstract void HealthMonitoring();
}

abstract class RameshDemo extends  MaheshDemo       //2025
{

    @Override
    public void AIIntegration() {
        System.out.println("Phone is having AI-Integration");
        
    }

    @Override
    public abstract void SatelliteConn();

    @Override
    public abstract  void HealthMonitoring();
    
}

class SureshDemo extends RameshDemo  //2026
{

    @Override
    public void SatelliteConn() {
        
        System.out.println("Phone is having Satellite Conn");
    }

    @Override
    public void HealthMonitoring() {
        System.out.println("Phone is having HealthMonitoring conn");
        
    }
    
}