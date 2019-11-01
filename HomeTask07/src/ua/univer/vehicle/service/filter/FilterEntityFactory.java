package ua.univer.vehicle.service.filter;

public class FilterEntityFactory {
	public MatchFilter getFilter(String filterName) {
		
		if (filterName.equalsIgnoreCase("car")) {
			return new CarFilter();
		}

		if (filterName.equalsIgnoreCase("plane")) {
			return new PlaneFilter();
		}

		if (filterName.equalsIgnoreCase("ship")) {
			return new ShipFilter();
		}

		return null;
	}
}
