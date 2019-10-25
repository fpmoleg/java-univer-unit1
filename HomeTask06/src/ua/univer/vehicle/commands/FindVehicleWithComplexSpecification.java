package ua.univer.vehicle.commands;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.specification.AndSpecification;
import ua.univer.vehicle.specification.IssueRangeSpecification;
import ua.univer.vehicle.specification.PriceRangeSpecification;
import ua.univer.vehicle.specification.Specification;
import ua.univer.vehicle.specification.SpeedRangeSpecification;

public class FindVehicleWithComplexSpecification extends Command {

	public FindVehicleWithComplexSpecification(VehicleList input, VehicleList output) {
		super(input, output);
	}

	@Override
	public void execute() {
		float averagePrice = getAveragePrice();
		float twentyPercentage = calulatePercentage(20, averagePrice);
		
		Specification issuesRange = new IssueRangeSpecification(2014, 2019),
					  priceRange = new PriceRangeSpecification(averagePrice - twentyPercentage, averagePrice + twentyPercentage),
					  speedRange = new SpeedRangeSpecification(100, 300);
		
		Specification andSpecification = new AndSpecification(issuesRange, priceRange, speedRange);
		
		for (Vehicle vehicle : input.getItems()) {
			if (andSpecification.isSatisfiedBy(vehicle)) {
				output.addVehicle(vehicle);
			}
		}
	}

	@Override
	public String toString() {
		return "Command: Display vehicles not older then 5 years with average price (+-20%) and speed in ragne from 100 to 300:";
	}
	
	private float getAveragePrice() {
		float result = 0;
		int counter = 0;
		
		for (Vehicle vehicle : input.getItems()) {
			result += vehicle.getPrice();
			counter++;
		}
		
		return result / counter;
	}
	
	private float calulatePercentage(float part, float total) {
		return (part / total) * 100;
	}
}
