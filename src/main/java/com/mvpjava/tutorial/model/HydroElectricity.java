package com.mvpjava.tutorial.model;

public class HydroElectricity extends ElectricityProvider 
{
	public Electricity generateHydroElectricty()
	{
		return new Electricity("Electricity generated from water!");
		
	}
}
