package ua.univer.house.specification;

import ua.univer.house.House;

public class ApartmentAreaSpecification implements Specification {
	private int area;
	
	public ApartmentAreaSpecification(int area) {
		this.area = area;
	}
	
	@Override
	public boolean isSatisfiedBy(House house) {
		return house.getApartmentArea() > this.area;
	}
}
