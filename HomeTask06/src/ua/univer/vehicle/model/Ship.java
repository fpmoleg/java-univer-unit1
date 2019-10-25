package ua.univer.vehicle.model;

public class Ship extends PasangerVehicle {
	private String port;
	
	public Ship(int x, int y, float price, int speed, int yearOfIssue, int passangerAmount, String port) {
		super(x, y, price, speed, yearOfIssue, passangerAmount);
		this.port = port;
	}

	@Override
	public String toString() {
		return "Ship[" +  super.toString() + ", port: " + port + "]";
	}
}
