package ua.univer.vehicle.model;

public abstract class Vehicle {
	private int x;
	private int y;
	private float price;
	private int speed;
	private int yearOfIssue;
	
	public Vehicle(int x, int y, float price, int speed, int yearOfIssue) {
		this.x = x;
		this.y = y;
		this.price = price;
		this.speed = speed;
		this.yearOfIssue = yearOfIssue;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X: " + x + ", Y: " + y + ", Price: " + price + ", Speed: "  + speed + ", Year Of Issue: " + yearOfIssue;
	}
	
	public float getPrice() {
		return price;
	}

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public int getSpeed() {
		return speed;
	}	
}
