package ua.univer.vehicle.service.speed;

import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.model.interfaces.SwimAble;

public class SwimSpeed implements Speed {

	@Override
	public int getSpeed(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return ((SwimAble) vehicle).swim();
	}
}
