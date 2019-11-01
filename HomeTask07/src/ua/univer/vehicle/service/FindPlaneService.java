package ua.univer.vehicle.service;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.filter.MatchFilter;
import ua.univer.vehicle.service.interfaces.Count;

public class FindPlaneService extends FindService implements Count {

	public FindPlaneService(MatchFilter filter) {
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

}
