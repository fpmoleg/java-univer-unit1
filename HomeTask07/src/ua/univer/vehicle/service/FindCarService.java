package ua.univer.vehicle.service;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Car;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.filter.MatchFilter;
import ua.univer.vehicle.service.interfaces.Count;

public class FindCarService extends FindService implements Count {

	public FindCarService(MatchFilter filter) {
		super(filter);
	}
	
	@Override
	public int count(VehicleList input) {
		int result = 0;
		
		for (Vehicle vehicle : input.getItems()) {
			if (this.isMatched(vehicle)) {
				result++;
			}
		}
		
		return result;
	}
	
	public Car findWithMinPrice(VehicleList input) {
		Car result = null;
		
		for (Vehicle vehicle : input.getItems()) {
			if (this.isMatched(vehicle)) {
				if (result != null) {
					if (result.getPrice() > vehicle.getPrice()) {
						result = (Car) vehicle;
					}
				} else {
					result = (Car) vehicle;		
				}				
			} 
		}
		
		return result;
	}
}
