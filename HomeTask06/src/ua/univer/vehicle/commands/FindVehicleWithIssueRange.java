package ua.univer.vehicle.commands;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.specification.IssueRangeSpecification;
import ua.univer.vehicle.specification.Specification;

public class FindVehicleWithIssueRange extends Command {	
	public FindVehicleWithIssueRange(VehicleList input, VehicleList output) {
		super(input, output);
	}

	@Override
	public void execute() {
		Specification issuesRange = new IssueRangeSpecification(2000, 2010);
		
		for (Vehicle vehicle : input.getItems()) {
			if (issuesRange.isSatisfiedBy(vehicle)) {
				output.addVehicle(vehicle);
			}
		}
	}

	@Override
	public String toString() {
		return "Display vehicles where a year of issue in range from 2000 to 2010:";
	}
}