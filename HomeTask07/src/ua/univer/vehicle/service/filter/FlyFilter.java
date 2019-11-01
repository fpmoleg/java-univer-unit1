package ua.univer.vehicle.service.filter;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.model.interfaces.FlyAble;

public class FlyFilter implements MatchFilter {
	@Override
	public boolean isMatched(Vehicle vehicle) {
		return vehicle instanceof FlyAble;
	}
}
