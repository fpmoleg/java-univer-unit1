package ua.univer.vehicle.specification;

import ua.univer.vehicle.model.Vehicle;

public class IssueRangeSpecification implements Specification {
	private int yearFrom;
	private int yearTo;
	
	public IssueRangeSpecification(int yearFrom, int yearTo) {
		this.yearFrom = yearFrom;
		this.yearTo = yearTo;
	}

	@Override
	public boolean isSatisfiedBy(Vehicle vehicle) {
		if (vehicle.getYearOfIssue() < yearFrom) {
			return false;
		}
		
		if (vehicle.getYearOfIssue() > yearTo) {
			return false;
		}
		
		return true;
	}
}
