package ua.univer.vehicle.service;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.filter.MatchFilter;

public abstract class FindService {
	protected MatchFilter filter;
	
	public FindService(MatchFilter filter) {
		this.filter = filter;
	}
	
	protected boolean isMatched(Vehicle vehicle) {
		return filter.isMatched(vehicle);
	}
}
