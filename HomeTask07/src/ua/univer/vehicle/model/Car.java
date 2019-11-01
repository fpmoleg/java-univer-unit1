package ua.univer.vehicle.model;

import ua.univer.vehicle.model.interfaces.MoveAble;

public class Car extends Vehicle implements MoveAble{

	public Car(int x, int y, float price, int speed, int yearOfIssue) {
		super(x, y, price, speed, yearOfIssue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car[" + super.toString() + "]";
	}

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}
}
