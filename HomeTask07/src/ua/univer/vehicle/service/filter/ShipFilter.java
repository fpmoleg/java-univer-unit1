package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Ship;
import ua.univer.vehicle.model.Vehicle;

public class ShipFilter implements MatchFilter {
	@Override
	public boolean isMatched(Vehicle vehicle) {
		return vehicle.getClass().equals(Ship.class);
	}
}
