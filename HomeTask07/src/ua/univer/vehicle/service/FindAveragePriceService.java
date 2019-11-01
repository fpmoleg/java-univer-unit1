package ua.univer.vehicle.service;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;

public class FindAveragePriceService {
	
	public float count(VehicleList list) {
		
		if (list.getSize() == 0) {
			return 0;
		}
		
		float result = 0;
	
		for (Vehicle vehicle : list.getItems()) {
			result += vehicle.getPrice(); 
		}
		
		return result / list.getSize();
	}
}
