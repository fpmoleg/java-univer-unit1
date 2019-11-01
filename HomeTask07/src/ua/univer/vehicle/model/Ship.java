package ua.univer.vehicle.model;

import ua.univer.vehicle.model.interfaces.SwimAble;

public class Ship extends PasangerVehicle implements SwimAble{
	private String port;
	
	public Ship(int x, int y, float price, int speed, int yearOfIssue, int passangerAmount, String port) {
		super(x, y, price, speed, yearOfIssue, passangerAmount);
		this.port = port;
	}

	@Override
	public String toString() {
		return "Ship[" +  super.toString() + ", port: " + port + "]";
	}

	@Override
	public int swim() {
		// TODO Auto-generated method stub
		return 0;
	}
}
