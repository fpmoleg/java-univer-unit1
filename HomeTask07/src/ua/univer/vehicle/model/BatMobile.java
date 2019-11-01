package ua.univer.vehicle.model;

import ua.univer.vehicle.model.interfaces.FlyAble;
import ua.univer.vehicle.model.interfaces.SwimAble;

public class BatMobile extends Car implements SwimAble, FlyAble {

	public BatMobile(int x, int y, float price, int speed, int yearOfIssue) {
		super(x, y, price, speed, yearOfIssue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int fly() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int swim() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "BatMobile [" + super.toString() + "]";
	}

	
}
