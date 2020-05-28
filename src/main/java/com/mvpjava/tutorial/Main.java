package com.mvpjava.tutorial;

import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mvpjava.tutorial.model.Electricity;
import com.mvpjava.tutorial.model.ElectricityProvider;
import com.mvpjava.tutorial.model.HydroElectricity;
import com.mvpjava.tutorial.model.NuclearElectricity;

@SpringBootApplication
public class Main implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Java 14 instanceof Tutorial - MVP Java");
		
		ElectricityProvider hydro = new HydroElectricity();
		ElectricityProvider nucler = new NuclearElectricity();
		List<ElectricityProvider> electricityProviders = List.of (hydro, nucler);
		
		loopThroughProviders(electricityProviders); // normal instanceof - pre Java 14
		loopThroughProvidersJava14(electricityProviders);
		
	}

	//Boilerplate, pre Java 14
	private void loopThroughProviders(List<ElectricityProvider> electricityProviders) {
		Electricity electricity;
		
		for (ElectricityProvider provider: electricityProviders)
		{
			if (provider instanceof HydroElectricity) 
			{
				HydroElectricity hydroElectricity = (HydroElectricity)provider;
				electricity = hydroElectricity.generateHydroElectricty();
			}
			else if (provider instanceof NuclearElectricity)
			{
				NuclearElectricity nuclearElectricity = (NuclearElectricity)provider;
				electricity = nuclearElectricity.generateNuclearPower();				
			}	
			else
			{
				throw new RuntimeException("Unknown Type!");
			}
			
			System.out.println(electricity);
		}
		

	}
	
	// Pattern matching in Java 14 for instanceof operator
	private void loopThroughProvidersJava14(List<ElectricityProvider> electricityProviders) {
		Electricity electricity;
		
		for (ElectricityProvider provider: electricityProviders)
		{
			if (provider instanceof HydroElectricity hydroElectricity) 
			{
				electricity = hydroElectricity.generateHydroElectricty();
				
			}
			else if (provider instanceof NuclearElectricity nuclearElectricity)
			{
				electricity = nuclearElectricity.generateNuclearPower();				
			}	
			else
			{
				throw new RuntimeException("Unknown Type!");
			}
			
			System.out.println(electricity);
		}
		
	}

}
