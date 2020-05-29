package com.mvpjava.tutorial.model.polymorphism;

import com.mvpjava.tutorial.model.Electricity;

public class HydroElectricity2 implements ElectricityProvider2 {

	@Override
	public Electricity generateElectricity() {
		return new Electricity("Electricity generated from water!");
	}

}
