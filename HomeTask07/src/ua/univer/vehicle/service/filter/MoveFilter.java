package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.model.interfaces.MoveAble;

public class MoveFilter implements MatchFilter {
	@Override
	public boolean isMatched(Vehicle vehicle) {
		return vehicle instanceof MoveAble;
	}
}
