package ua.univer.vehicle;

import ua.univer.vehicle.model.Amfibia;
import ua.univer.vehicle.model.BatMobile;
import ua.univer.vehicle.model.Car;
import ua.univer.vehicle.model.Plane;
import ua.univer.vehicle.model.Ship;
import ua.univer.vehicle.model.Vehicle;
import ua.univer.vehicle.service.FindAveragePriceService;
import ua.univer.vehicle.service.FindCarService;
import ua.univer.vehicle.service.FindMaxSpeedService;
import ua.univer.vehicle.service.FindPlaneService;
import ua.univer.vehicle.service.FindShipWithFixedIssuesDate;
import ua.univer.vehicle.service.FindVehicleService;
import ua.univer.vehicle.service.filter.CarFilter;
import ua.univer.vehicle.service.filter.FilterEntityFactory;
import ua.univer.vehicle.service.filter.FilterMovementFactory;
import ua.univer.vehicle.service.filter.PlaneFilter;
import ua.univer.vehicle.service.filter.ShipFilter;
import ua.univer.vehicle.service.speed.FlySpeed;
import ua.univer.vehicle.service.speed.MoveSpeed;
import ua.univer.vehicle.service.speed.SwimSpeed;


public class Program {

	public static void main(String[] args) {
		VehicleList input  = new VehicleList();
		
		addVehicles(input);
		
		FilterEntityFactory entityFilter = new FilterEntityFactory();
		
		FindCarService carService = new FindCarService(entityFilter.getFilter("car"));
		
		System.out.println("COUNT CARS: " + carService.count(input));
		System.out.println("The cheapest car:");
		System.out.println(carService.findWithMinPrice(input));
		
		FindPlaneService planeService = new FindPlaneService(entityFilter.getFilter("plane"));
		
		System.out.println("COUNT PLANES: " + planeService.count(input));
		
		FindShipWithFixedIssuesDate shipService = new FindShipWithFixedIssuesDate(
			entityFilter.getFilter("ship"), 2000, 2010
		);
		
		System.out.println("List of ships with year of issue from 2000 to 2010");
		
		for (Vehicle vehicle : shipService.getShipList(input).getItems()) {
			System.out.println(vehicle);	
		}
		
		FilterMovementFactory movementFilter = new FilterMovementFactory();
		FindAveragePriceService averagePrice = new FindAveragePriceService();
		
		FindVehicleService vehicleService = null;
		FindMaxSpeedService maxSpeed = null;
		
		vehicleService = new FindVehicleService(movementFilter.getFilter("move"));		
		System.out.println("Average Price for move vehicles");
		System.out.println(averagePrice.count(vehicleService.getVehicleList(input)));
		
		maxSpeed = new FindMaxSpeedService(new MoveSpeed());
		System.out.println("Max speed for move vehicles");
		System.out.println(maxSpeed.find(vehicleService.getVehicleList(input)));
		
		vehicleService = new FindVehicleService(movementFilter.getFilter("fly"));
		System.out.println("Average Price for fly vehicles");
		System.out.println(averagePrice.count(vehicleService.getVehicleList(input)));
		
		maxSpeed = new FindMaxSpeedService(new FlySpeed());
		System.out.println("Max speed for fly vehicles");
		System.out.println(maxSpeed.find(vehicleService.getVehicleList(input)));
		
		vehicleService = new FindVehicleService(movementFilter.getFilter("swim"));
		System.out.println("Average Price for swim vehicles");
		System.out.println(averagePrice.count(vehicleService.getVehicleList(input)));
		
		maxSpeed = new FindMaxSpeedService(new SwimSpeed());
		System.out.println("Max speed for swim vehicles");
		System.out.println(maxSpeed.find(vehicleService.getVehicleList(input)));
	}
	
	private static void addVehicles(VehicleList vehicles) {
		/**
		 * Add cars.
		 * */
		vehicles.addVehicle(
			new Car(10, 100, 1000, 150, 1998)
		);
		vehicles.addVehicle(
			new Car(100, 10, 10000, 250, 2019)
		);
		vehicles.addVehicle(
			new Car(50, 50, 2500, 200, 2011)
		);
		vehicles.addVehicle(
			new Car(10, 10, 500, 180, 2001)
		);
		/**
		 * Add planes.
		 * */
		vehicles.addVehicle(
			new Plane(20, 40, 1500, 300, 2001, 5, 1000)
		);	
		vehicles.addVehicle(
			new Plane(30, 130, 150000, 350, 2002, 60, 2500)
		);	
		vehicles.addVehicle(
			new Plane(45, 95, 2000000, 400, 2015, 200, 7000)
		);	
		/**
		 * Add ships.
		 * */		
		vehicles.addVehicle(
			new Ship(100, 100, 15000, 20, 2005, 20, "Port Artur")
		);	
		vehicles.addVehicle(
			new Ship(-5, 30, 200000, 40, 2010, 1000, "Lorem Ipsum")		
		);
		vehicles.addVehicle(
			new Ship(5, 5, 150000, 20, 1998, 100, "John Doe")
		);	
		/**
		 * Add BatMobile.
		 * */
		vehicles.addVehicle(
			new BatMobile(20, 20, 35000, 150, 2014)
		);
		/**
		 * Add Amfibia.
		 * */
		vehicles.addVehicle(
			new Amfibia(10, 10, 35000, 30, 2015)
		);
	}
}
