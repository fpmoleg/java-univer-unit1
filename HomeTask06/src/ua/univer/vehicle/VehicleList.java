package ua.univer.vehicle;

import java.util.Arrays;

import ua.univer.vehicle.model.Vehicle;

public class VehicleList {
	private static final byte BUFFER_SIZE = 12;
	
	private Vehicle[] items;
	
	private int size = 0;
	
	public VehicleList() {
		items = new Vehicle[BUFFER_SIZE]; 
	}

	public boolean addVehicle(Vehicle vehicle) {
		if (size < BUFFER_SIZE) {
			items[size++] = vehicle;
			return true;
		}
		
		return false;
	}
	
	public Vehicle[] getItems() {		
		return Arrays.copyOfRange(items, 0, size);
	}
}
