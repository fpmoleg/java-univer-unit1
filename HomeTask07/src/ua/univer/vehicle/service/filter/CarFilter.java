package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Car;
import ua.univer.vehicle.model.Vehicle;

public class CarFilter implements MatchFilter {
	@Override
	public boolean isMatched(Vehicle vehicle) {
		return vehicle.getClass().equals(Car.class);
	}
}
