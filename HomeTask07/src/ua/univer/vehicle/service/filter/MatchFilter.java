package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Vehicle;

public interface MatchFilter {
	public boolean isMatched(Vehicle vehicle);
}