package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.model.interfaces.SwimAble;

public class SwimFilter implements MatchFilter {
	@Override
	public boolean isMatched(Vehicle vehicle) {
		return vehicle instanceof SwimAble;
	}
}