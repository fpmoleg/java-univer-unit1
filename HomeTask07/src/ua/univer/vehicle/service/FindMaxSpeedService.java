package ua.univer.vehicle.service;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.speed.Speed;

public class FindMaxSpeedService {
	private Speed speed;

	public FindMaxSpeedService(Speed speed) {
		this.speed = speed;
	}
	
	public int find(VehicleList vehicles) {
		int result = 0;
		int speed;
		
		for (Vehicle vehicle : vehicles.getItems()) {
			speed = this.speed.getSpeed(vehicle);
			
			if (result < speed) {
				result = speed;
			}
		}
		
		return result;
	}
}
