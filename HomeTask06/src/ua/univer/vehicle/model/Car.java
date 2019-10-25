package ua.univer.vehicle.model;

public class Car extends Vehicle {

	public Car(int x, int y, float price, int speed, int yearOfIssue) {
		super(x, y, price, speed, yearOfIssue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car[" + super.toString() + "]";
	}
}
