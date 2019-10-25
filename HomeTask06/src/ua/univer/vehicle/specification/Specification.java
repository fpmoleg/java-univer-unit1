package ua.univer.vehicle.specification;

import ua.univer.vehicle.model.Vehicle;

public interface Specification {
	public boolean isSatisfiedBy(Vehicle vehicle);
}
