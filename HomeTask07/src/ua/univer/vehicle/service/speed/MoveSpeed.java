package ua.univer.vehicle.service.speed;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.model.interfaces.MoveAble;

public class MoveSpeed implements Speed {
	@Override
	public int getSpeed(Vehicle vehicle) {
		return ((MoveAble) vehicle).move();
	}
}
