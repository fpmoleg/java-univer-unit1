package ua.univer.vehicle.model;

public abstract class PasangerVehicle extends Vehicle {
	private int passangerAmount;
	
	public PasangerVehicle(int x, int y, float price, int speed, int yearOfIssue, int passangerAmount) {
		super(x, y, price, speed, yearOfIssue);
		
		this.passangerAmount = passangerAmount;
	}

	@Override
	public String toString() {
		return super.toString() + ", passangerAmount: " + passangerAmount;
	}
}
