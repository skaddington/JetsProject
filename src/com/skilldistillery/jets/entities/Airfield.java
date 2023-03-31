package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
	private List<Jets> fleet;
	
	public Airfield() {
		//populate the fleet from the file
	}

	public List<Jets> readFromFile(String fn) {
		List<Jets> jets = new ArrayList<>();
		// buffreader
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fn))) {
			String jetInfo;
			while ((jetInfo = bufIn.readLine()) != null) {
				// as a jet is read, create a jet, add jet to List

				String[] jetDetails = jetInfo.split(",");
				//create the appropriate jet based on the details
				/*
				 * if the jetDetails[0] happens to be a DCV, then create a DilithiumPowered jet
				 * if the jetDetails[0] happens to be a fighter, then create a fighter jet
				 */
				// add that specific jet type to your list of jets
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return jets;
	}

}
