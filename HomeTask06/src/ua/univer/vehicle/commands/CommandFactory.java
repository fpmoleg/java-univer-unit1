package ua.univer.vehicle.commands;

import ua.univer.vehicle.VehicleList;

public final class CommandFactory {
	public static Command getComamnd(int commandId, VehicleList input, VehicleList output) {
		Command command = null;
		
		switch (commandId) {
			case 1:
				command = new FindVehicleWithMaxPrice(input, output);
				break;
			case 2:
				command = new FindVehicleWithMinPrice(input, output);
				break;
			case 3:		
				command = new FindVehicleWithPriceAndIssue(input, output);
				break;
			case 4:			
				command = new FindVehicleWithIssueRange(input, output);
				break;
			case 5:			
				command = new FindVehicleWithComplexSpecification(input, output);
				break;
			default:
				// Throw exception!!!
				break;
		}
		
		return command;
	}
}
