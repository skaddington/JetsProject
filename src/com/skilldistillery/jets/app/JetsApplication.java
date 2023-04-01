package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.OtherJets;

public class JetsApplication {
	Scanner kb = new Scanner(System.in);
	Airfield hanger = new Airfield();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
	}

	public void launch() {
		hanger.readFromFile();
		useMenu();
	}


	public void printMenu() {
		System.out.println();
		System.out.println("**********************************");
		System.out.println("-------------- Jets --------------");
		System.out.println("----------------------------------");
		System.out.println("  1. List the fleet               ");
		System.out.println("  2. Scramble the jets            ");
		System.out.println("  3. Speedy Gonzales              ");
		System.out.println("  4. In for the Longhaul          ");
		System.out.println("  5. Show me the Cargo            ");
		System.out.println("  6. Dogfight!                    ");
		System.out.println("  7. Add a jet to the airfield    ");
		System.out.println("  8. Remove a jet to the airfield ");
		System.out.println("  9. Quit                         ");
		System.out.println("----------------------------------");
		System.out.println("**********************************");
		System.out.println();
	}
	
	public void useMenu() {
		int choice;
		boolean keepGoing = true;
		
		while (keepGoing) {
			printMenu();
			System.out.println("Please choose an option:");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				hanger.printList();
				break;
			case 2:
				hanger.printScramble();
				break;
			case 3:
				hanger.getFastest();
				break;
			case 4:
				hanger.getLongest();
				break;
			case 5:
				hanger.getCargo();
				break;
			case 6:
				hanger.getDogfight();
				break;
			case 7:
				getAddJet();
				break;
			case 8:
				getRemoveJet();
				break;
			case 9:
				keepGoing = false;
				printQuit();
				break;
			default:
				System.out.println("Invalid entry, please choose an option from the menu.");
			}
		}
	}

	public void getAddJet() {
		kb.nextLine();
		System.out.println("What is the model of the jet you'd like to add? ");
		String model = kb.nextLine();
		System.out.println("How fast can your jet go in MPH? ");
		double speed = kb.nextDouble();
		System.out.println("What is the range of your jet in miles? ");
		int range = kb.nextInt();
		System.out.println("How much does your jet cost in USD? ");
		long price = kb.nextLong();
		hanger.addJet(model, speed, range, price);

	}

	public void getRemoveJet() {
		kb.nextLine();
		hanger.getModel();
		System.out.println("\nPlease enter the model of the jet you would like to remove from the Airfield. ");
		String userChoice = kb.nextLine();
		System.out.println("sending removal info");
		hanger.removeJet(userChoice);
	}

	public void printQuit() {
		System.out.println("Thank you for visiting our Airfield!");
	}
}
