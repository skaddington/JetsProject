# JetsProject

## Overview

- **What is the End Goal?**
<p>The goal of the Jets Project is to give the user a way to interact with an airfield of jets. The user can gain information about the jets, scramble them, and even add or remove jets from the airfield.

- **General Starter Setup :**
<p>Create parent/child classes (abstract if appropriate), interfaces, class fields, imports, methods, constructors, getters, setters, and toString methods according to the UML or where appropriate, fill a .txt file with jet information to read in.

- **User Story #1 :** 
<p>The JetsApplication is the only class with a main method which launches our application after instantiating an instance of the class. It is also the only class with a Scanner; all of the user input required bits will have some part in this class.

- **User Story #2 :** 
<p>The Airfield, a.k.a. the hanger, class is where the bulk of the code lies. It holds the ArrayList (or fleet) of jets which will start out as empty. During options 7 & 8, once the user input has been received in the JetsApplication, the hanger is called and completes the remaining tasks in this class.

- **User Story #3 :** 
<p>When the JetsApplication launches, the Airfield is populated using a readFromFile method that reads in the jets.txt file utilizing FileReader and BufferedReader. As the file is read, the lines of jet information are split into individual Strings. These Strings are then parsed into the appropriate data type. These details get passed along to a constructor depending on the type of jet and gets added to the fleet.

- **User Story #4 :** 
<p>A while loop using a true boolean keeps the menu running and a switch gets the user to the option that they choose. The user is presented with a menu containing 9 options:
<br>1. List the fleet
<br>2. Scramble the jets
<br>3. Speedy Gonzales
<br>4. In for the Longhaul
<br>5. Show me the Cargo
<br>6. Dogfight!
<br>7. Add a jet to the fleet
<br>8. Remove a jet to the fleet
<br>9. Quit 

- **User Story #5 :** 
<p>Option 1 : A for each loop using toStrings lists the jets in the fleet. The  information shown includes: model, speed in MPH, range in miles, and price.

- **User Story #6 :** 
<p>Option 2 : Scramble the jets used another for each loop that calls the fly method for each jet and prints out the same information as before with an addition of the fuel exhaustion time.

- **User Story #7 :** 
<p>Options 3 & 4 : Utilizing for each loops and some boolean logic, we are able to discern which jet is the fastest and which has the longest range. The user is then able to view these jets from their menu selection. 

- **User Story #8 :** 
<p>Option 5 & 6 : These call certain types of jets to perform additional actions via implementation of interfaces. Those certain types are found by use of a for each loop and instanceof. If it's a Cargo type, the CargoCarrier interface allows it to load cargo and a line will print that the jet is loading. If it's a Fighter type, the CombatReady interface allows the jet to enter a Dogfight, relaying back a message about its status. 

- **User Story #9 :** 
<p>Option 7 : If the user wishes to add their own jet, this is the place to do it. The application prompts the user for the model, speed, range, and price which is then sent over to the hanger to be added to the fleet of jets. The hanger sends back a message that the jet has been added and displays the information that was submitted. If the user wants to verify it was added, they can select option 1 again and see that it was.

- **User Story #10 :** 
<p>Option 8 : Not only can the user add jets, but they can remove them as well. The application prints out the models of the current fleet using a for each loop and getModel method. The user is prompted to enter the model they want to remove from the available list. Their input gets sent over to the hanger and using an Iterator and .contains searches the list for a matching model, the jet is removed. As before when adding a jet, the hanger sends back a confirmation message that the jet was removed.The user can double check the same way as before.

- **User Story #11 :** 
<p>If the user has done all they wish to do in the application, they can choose to quit which displays a farewell message, changes the boolean to false ending the while loop and ends the program.

## Technologies Used
- Java~OOP
- Eclipse
- Git
- Google - Stack Overflow, Oracle
- Saturday TA Help (Thank you!)

## Lessons Learned
- Abstraction, Polymorphism, Inheritance, Encapsulation
- ArrayLists
- Parent/Child classes, Interface implementation
- Abstract classes and methods
- Parse, Iterators, InstanceOf
- Input/Output Streams, Try & Catch, FileReaders & BufferedReaders
- Loops : if, for, while, switch
- Most Prominent BrainBlocks
<br>- I eventually had to Google "string to double" for the readFromFile method. I had forgotten about parsing and had such a lightbulb moment that my husband chuckled at me.
<br>- Denise helped me diagnose that the fuelExhaustionTime kept printing out as 0 due to the no-arg constructor being used rather than the constructor that took in arguments/parameters.
