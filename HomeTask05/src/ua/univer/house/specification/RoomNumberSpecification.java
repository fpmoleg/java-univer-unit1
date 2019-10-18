package ua.univer.house.specification;

import ua.univer.house.House;

public class RoomNumberSpecification implements Specification{
	private int fixedNumber;
	
	public RoomNumberSpecification(int number) {
		this.fixedNumber = number;
	}
	
	@Override
	public boolean isSatisfiedBy(House house) {
		return this.fixedNumber == house.getRoomNumbers();
	}
}
