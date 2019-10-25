package ua.univer.vehicle.specification;

import ua.univer.vehicle.model.Vehicle;

public class AndSpecification implements Specification {
	private Specification[] specifications;
	
	public AndSpecification(Specification ...specifications) {
		this.specifications = specifications;
	}

	@Override
	public boolean isSatisfiedBy(Vehicle vehicle) {
		for (Specification specification : specifications) {
			if (!specification.isSatisfiedBy(vehicle)) {
				return false;
			}
		}
		
		return true;
	}

}
