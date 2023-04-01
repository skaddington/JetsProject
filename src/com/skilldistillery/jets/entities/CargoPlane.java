package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {


	public CargoPlane() {
		super();
	}
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void loadCargo() {
		System.out.println("loading care package...");
	}

}
