package ua.univer.house;

import java.util.Arrays;

import ua.univer.house.specification.Specification;

public class HouseList {
	private static final byte BUFFER_SIZE = 10;
	
	private int size = 0;
	
	private House[] houses;
	
	public HouseList() {
		this.houses = new House[BUFFER_SIZE];
	}
	
	public boolean addHouse(House house) {
		if (size < BUFFER_SIZE) {
			this.houses[size++] = house;
			return true;
		}
		
		return false;
	}
	
	public House[] getHousesBy(Specification specification) {
		House[] result = new House[BUFFER_SIZE];
		int i = 0;
		
		for (House house : this.houses) {
			if (specification.isSatisfiedBy(house)) {
				result[i++] = house;
			}
		}
		
		result = Arrays.copyOfRange(result, 0, i);
		
		return result;
	}
}
