package ua.univer.vehicle.commands;

import ua.univer.vehicle.VehicleList;

public abstract class Command {
	
	protected VehicleList input;
	
	protected VehicleList output;
	
	public Command(VehicleList input, VehicleList output) {
		this.input  = input;
		this.output = output;
	}
	
	abstract public void execute();
}
