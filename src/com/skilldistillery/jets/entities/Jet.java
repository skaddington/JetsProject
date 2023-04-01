package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	private double fuelExhaustionTime;

	public Jet() {
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.fuelExhaustionTime = getFuelExhaustionTime();
	}

	public void fly() {
		System.out.println("Jets [model = " + model + ", speed = " + speed + " MPH, range = " + range + " miles, price = $" + price
				+ ", fuelExhaustionTime = " + fuelExhaustionTime + " hours]");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getFuelExhaustionTime() {
		double fet = (double)range / speed;
		fuelExhaustionTime = Math.round(fet*100.0)/100.0;
		return fuelExhaustionTime;
	}

	@Override
	public String toString() {
		return "Jets [model = " + model + ", speed = " + speed + " MPH, range = " + range + " miles, price = $" + price + "]";
	}

}
