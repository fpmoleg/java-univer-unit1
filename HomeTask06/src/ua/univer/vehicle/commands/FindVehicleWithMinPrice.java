package ua.univer.vehicle.commands;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;

public class FindVehicleWithMinPrice extends Command {

	public FindVehicleWithMinPrice(VehicleList input, VehicleList output) {
		super(input, output);
	}

	@Override
	public void execute() {
		Vehicle[] vehicles = input.getItems();
		
		Vehicle result = vehicles[0];
		
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getPrice() < result.getPrice()) {
				result = vehicle;
			}
		}
		
		output.addVehicle(result);
	}

	@Override
	public String toString() {
		return "Display a vehicle with the lowest price:";
	}
}
