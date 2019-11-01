package ua.univer.vehicle.service.filter;

public class FilterMovementFactory {
	public MatchFilter getFilter(String filterName) {
		
		if (filterName.equalsIgnoreCase("move")) {
			return new MoveFilter();
		}

		if (filterName.equalsIgnoreCase("swim")) {
			return new SwimFilter();
		}

		if (filterName.equalsIgnoreCase("fly")) {
			return new FlyFilter();
		}

		return null;
	}
}
