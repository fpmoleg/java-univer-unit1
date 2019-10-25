package ua.univer.vehicle;

import ua.univer.vehicle.commands.Command;
import ua.univer.vehicle.commands.CommandFactory;
import ua.univer.vehicle.model.Car;
import ua.univer.vehicle.model.Plane;
import ua.univer.vehicle.model.Ship;
import ua.univer.vehicle.model.Vehicle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleList input  = new VehicleList();
		VehicleList output = new VehicleList();
		
		addVehicles(input);
		
		Command command = CommandFactory.getComamnd(Menu.getCommand(), input, output);
	
		Invoker invoker = new Invoker();
		
		invoker.setCommand(command);
		invoker.run();
		
		System.out.println(command);
		for (Vehicle vehicle : output.getItems()) {
			System.out.println(vehicle);	
		}
	}
	
	private static void addVehicles(VehicleList vehicles) {
		/**
		 * Add cars.
		 * */
		vehicles.addVehicle(
			new Car(10, 100, 10000, 150, 1998)
		);
		vehicles.addVehicle(
			new Car(100, 10, 100000, 250, 2019)
		);
		vehicles.addVehicle(
			new Car(50, 50, 25000, 200, 2011)
		);
		vehicles.addVehicle(
			new Car(10, 10, 5000, 180, 2001)
		);
		/**
		 * Add planes.
		 * */
		vehicles.addVehicle(
			new Plane(20, 40, 15000, 300, 2001, 5, 1000)
		);	
		vehicles.addVehicle(
			new Plane(30, 130, 1500000, 350, 2002, 60, 2500)
		);	
		vehicles.addVehicle(
			new Plane(45, 95, 20000000, 400, 2015, 200, 7000)
		);	
		/**
		 * Add ships.
		 * */		
		vehicles.addVehicle(
			new Ship(100, 100, 150000, 20, 2005, 20, "Port Artur")
		);	
		vehicles.addVehicle(
			new Ship(-5, 30, 200000000, 40, 2019, 1000, "Lorem Ipsum")		
		);	
	}
}
