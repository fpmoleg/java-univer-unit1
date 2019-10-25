package ua.univer.vehicle;

import java.util.Scanner;

public class Menu {
	public static int getCommand() {		
		
		int command;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose a command for selecting vehicles");
		System.out.println("---------------------------------------");
		System.out.println("1. Display a vehicle with the biggest price.");
		System.out.println("2. Display a vehicle with the lowest price.");
		System.out.println("3. Display vehicles where prices is lower then 10000 and yanger then 2000.");
		System.out.println("4. Display vehicles where a year of issue in range from 2000 to 2010.");
		System.out.println("5. Display vehicles not older then 5 years with average price (+-20%) and speed in ragne from 100 to 300");
		
		command = input.nextInt();
		
		if (!validCommand(command)) {
			System.out.println("The selected command is not supperted!!!");
			getCommand();
		}
		
		return command;
	}
	
	private static boolean validCommand(int command) {
		if ((command < 1) || (command > 5)){
			return false;
		}
		
		return true;
	}
}
