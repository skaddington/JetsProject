package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airfield {
	private List<Jet> fleet;

	public Airfield() {
		this.fleet = readFromFile();
	}

//	@Override
//	public String toString() {
//		return "Airfield [fleet=" + fleet + "]";
//	}

	public List<Jet> readFromFile() {
		List<Jet> jets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String jetInfo;
			while ((jetInfo = bufIn.readLine()) != null) {
				String[] jetDetails = jetInfo.split(",");
				String model = jetDetails[1];
				Double speed = Double.parseDouble(jetDetails[2]);
				int range = Integer.parseInt(jetDetails[3]);
				long price = Long.parseLong(jetDetails[4]);

				if (jetDetails[0].equals("CargoPlane")) {
					Jet jet = new CargoPlane(model, speed, range, price);
					jets.add(jet);

				} else if (jetDetails[0].equals("FighterJet")) {
					Jet jet = new FighterJet(model, speed, range, price);
					jets.add(jet);

				} else {
					Jet jet = new OtherJets(model, speed, range, price);
					jets.add(jet);

				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public void printList() {
		for (Jet jet : fleet) {
			System.out.println(jet);
		}
	}

	public void printScramble() {
		for (Jet jet : fleet) {
			jet.fly();
		}
	}

	public void getFastest() {
		System.out.println("Our \"Speedy Gonzalez\" jet is: ");
		double fastest = 0.0;
		Jet fastestJet = null;
		for (Jet jet : fleet) {
			if (fastest < jet.getSpeed()) {
				fastest = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println(fastestJet);
	}

	public void getLongest() {
		System.out.println("Our \"In it for the longhaul\" jet is: ");
		double longest = 0;
		Jet longestRange = null;
		for (Jet jet : fleet) {
			if (longest < jet.getRange()) {
				longest = jet.getRange();
				longestRange = jet;
			}
		}
		System.out.println(longestRange);
	}

	public void getCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}

	public void getDogfight() {
		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}

	public void addJet(String model, double speed, int range, long price) {
		Jet jet = new OtherJets(model, speed, range, price);
		fleet.add(jet);
		System.out.println(jet + " has been added to the airfield.");
	}

	public void removeJet(String userChoice) {
		Jet toBeRemoved = null;
		for ( Iterator<Jet> it = fleet.iterator() ; it.hasNext();) {
			Jet jet = it.next();
			if ( jet.getModel().contains(userChoice)) {
				it.remove();
				System.out.println(jet.getModel() + " has been removed from the Airfield.");
			}
		}
	}
	
	public void getModel() {
		for ( Jet jet : fleet) {
			System.out.println(jet.getModel());
		}
	}
}
