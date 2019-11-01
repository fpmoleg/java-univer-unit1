package ua.univer.vehicle.service.speed;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.model.interfaces.FlyAble;

public class FlySpeed implements Speed {
	@Override
	public int getSpeed(Vehicle vehicle) {
		return ((FlyAble) vehicle).fly();
	}
}
