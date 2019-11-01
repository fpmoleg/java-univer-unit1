package ua.univer.vehicle.service;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.filter.MatchFilter;

public class FindVehicleService extends FindService {

	public FindVehicleService(MatchFilter filter) {
		super(filter);
	}

	public VehicleList getVehicleList(VehicleList input) {
		VehicleList result = new VehicleList();
		
		for (Vehicle vehicle : input.getItems()) {
			if (this.isMatched(vehicle)) {
				result.addVehicle(vehicle);
			} 
		}
		
		return result;
	}
}
