package ua.univer.house.specification;

import ua.univer.house.House;

public interface Specification {
	public boolean isSatisfiedBy(House house);
}
