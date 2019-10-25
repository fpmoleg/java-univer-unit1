package ua.univer.vehicle.specification;

import ua.univer.vehicle.model.Vehicle;

public class PriceRangeSpecification implements Specification {

	private float priceFrom;
	private float priceTo;
	
	public PriceRangeSpecification(float priceFrom, float priceTo) {
		super();
		this.priceFrom = priceFrom;
		this.priceTo = priceTo;
	}	
	
	@Override
	public boolean isSatisfiedBy(Vehicle vehicle) {
		if (vehicle.getPrice() < priceFrom) {
			return false;
		}
		
		if (vehicle.getPrice() > priceTo) {
			return false;
		}
		
		return true;
	}

}
