package ua.univer.vehicle.specification;

import ua.univer.vehicle.model.Vehicle;

public class LessFixedPriceSpecification implements Specification {
	private float price;
	
	public LessFixedPriceSpecification(float price) {
		this.price = price;
	}

	@Override
	public boolean isSatisfiedBy(Vehicle vehicle) {
		return vehicle.getPrice() < price;
	}
}
