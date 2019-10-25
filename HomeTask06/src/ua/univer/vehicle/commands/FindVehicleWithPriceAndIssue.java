package ua.univer.vehicle.commands;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.specification.AndSpecification;
import ua.univer.vehicle.specification.IssueRangeSpecification;
import ua.univer.vehicle.specification.LessFixedPriceSpecification;
import ua.univer.vehicle.specification.Specification;

public class FindVehicleWithPriceAndIssue extends Command {
	
	public FindVehicleWithPriceAndIssue(VehicleList input, VehicleList output) {
		super(input, output);
	}

	@Override
	public void execute() {
		Specification lessPrice = new LessFixedPriceSpecification(10000),
					  issueRange = new IssueRangeSpecification(2000, 2019);
		
		Specification andSpecification = new AndSpecification(lessPrice, issueRange);
		
		for (Vehicle vehicle : input.getItems()) {
			if (andSpecification.isSatisfiedBy(vehicle)) {
				output.addVehicle(vehicle);
			}
		}
	}

	@Override
	public String toString() {
		return "Display vehicles where prices is lower then 10000 and yanger then 2000:";
	}
}
 