package ua.univer.house.specification;

import ua.univer.house.House;

public class AndSpecification implements Specification {
	private Specification[] specifications;
	
	public AndSpecification(Specification ...specifications) {
		this.specifications = specifications;		
	}
	
	public boolean isSatisfiedBy(House house) {
		for (Specification specification : specifications) {
			if (!specification.isSatisfiedBy(house)) {
				return false;
			}
		}
		
		return true;
	}
}
