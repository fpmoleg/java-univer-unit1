package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Plane;
import ua.univer.vehicle.model.Vehicle;

public class PlaneFilter implements MatchFilter {
	@Override
	public boolean isMatched(Vehicle vehicle) {
		return vehicle.getClass().equals(Plane.class);
	}
}
