package ua.univer.house.specification;

import ua.univer.house.House;

public class FloorSpecification implements Specification {
	private int from;
	
	private int to;
	
	public FloorSpecification(int fromm, int to) {
		this.from = from;
		this.to = to;
	}
	
	public boolean isSatisfiedBy(House house) {
		if (house.getFloor() > this.to) {
			return false;
		}
		
		if (house.getFloor() < this.from) {
			return false;
		}
		
		return true;
	}
}
