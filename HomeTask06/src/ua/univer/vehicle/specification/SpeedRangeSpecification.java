package ua.univer.vehicle.specification;

import ua.univer.vehicle.model.Vehicle;

public class SpeedRangeSpecification implements Specification {
	private int speedFrom;
	private int speedTo;
		
	public SpeedRangeSpecification(int speedFrom, int speedTo) {
		this.speedFrom = speedFrom;
		this.speedTo = speedTo;
	}

	@Override
	public boolean isSatisfiedBy(Vehicle vehicle) {
		if (vehicle.getSpeed() < speedFrom) {
			return false;
		}
		
		if (vehicle.getSpeed() > speedTo) {
			return false;
		}
		
		return true;
	}

}
