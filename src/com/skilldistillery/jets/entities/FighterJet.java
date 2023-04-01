package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {


	public FighterJet() {
		super();
	}
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println("acquiring target . . . target locked . . . firing missiles . . .");
	}

}
