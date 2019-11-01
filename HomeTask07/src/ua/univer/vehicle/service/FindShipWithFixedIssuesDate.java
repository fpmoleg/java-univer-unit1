package ua.univer.vehicle.service;

import ua.univer.vehicle.VehicleList;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.filter.MatchFilter;

public class FindShipWithFixedIssuesDate extends FindVehicleService {

	private int yearFrom;
	private int yearTo;
	
	public FindShipWithFixedIssuesDate(MatchFilter filter, int yearFrom, int yearTo) {
		super(filter);
		
		this.yearFrom = yearFrom;
		this.yearTo = yearTo;
	}

	public VehicleList getShipList(VehicleList input) {
		VehicleList result = new VehicleList();
		
		for (Vehicle vehicle : super.getVehicleList(input).getItems()) {
			
			if (vehicle.getYearOfIssue() >= this.yearFrom && 
				vehicle.getYearOfIssue() <= this.yearTo) {
				result.addVehicle(vehicle);	
			}
		}
		
		return result;
	}
}
