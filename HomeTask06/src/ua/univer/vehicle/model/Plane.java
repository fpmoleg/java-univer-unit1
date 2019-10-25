package ua.univer.vehicle.model;

public class Plane extends PasangerVehicle {

	private int height;
	
	public Plane(int x, int y, float price, int speed, int yearOfIssue, int passangerAmount, int height) {
		super(x, y, price, speed, yearOfIssue, passangerAmount);
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Plane[" +  super.toString() + ", height: " + height + "]";
	}
}
