package ua.univer.house;

import ua.univer.house.specification.AndSpecification;
import ua.univer.house.specification.ApartmentAreaSpecification;
import ua.univer.house.specification.FloorSpecification;
import ua.univer.house.specification.RoomNumberSpecification;

public class Program {

	public static void main(String[] args) {
		HouseList houseList = new HouseList();
		
		houseList.addHouse(
			new House(1, 97, 60, 4, 3, "72 Addison Lane\n" + 
					"Fairborn, OH 45324", "2 Bedroom", 98)
		);
		
		houseList.addHouse(
			new House(2, 163, 111, 8, 4, "19 Shub Farm Rd.\n" + 
					"Elkton, MD 21921", "3 Bedroom", 150)
		);
		
		houseList.addHouse(
			new House(3, 209, 78, 4, 1, "34 Shore St.\n" + 
					"Yuma, AZ 85365", "Studio Flats", 75)
		);
			
		houseList.addHouse(
			new House(4, 201, 113, 7, 5, "8514 Snake Hill St.\n" + 
					"Mechanicsville, VA 23111", "4 Bedroom+", 86)
		);
			
		houseList.addHouse(
			new House(5, 60, 112, 5, 2, "8167 East Chapel Lane\n" + 
					"Avon Lake, OH 44012", "1 Bedroom", 90)
		);
				
		houseList.addHouse(
			new House(6, 106, 115, 4, 4, "8761 Goldfield St.\n" + 
					"Southington, CT 06489", "3 Bedroom", 150)
		);
		
		houseList.addHouse(
			new House(7, 84, 84, 9, 2, "7059 Forest St.\n" + 
					"Simpsonville, SC 29680", "1 Bedroom", 50)
		);
				
		houseList.addHouse(
			new House(8, 92, 82, 6, 8, "8064 Plymouth St.\n" + 
					"Houston, TX 77016", "Penthouse", 97)
		);
				
		houseList.addHouse(
			new House(9, 70, 102, 7, 3, "8930 Thomas Street\n" + 
					"Winter Park, FL 32792", "2 Bedroom", 52)
		);
					
		houseList.addHouse(
			new House(10, 48, 90, 6, 2, "663 Woodsman Ave.\n" + 
					"Goshen, IN 46526", "1 Bedroom", 80)
		);
		
		
		System.out.println("Display houses/flats where room numbers equal 3");
		
		RoomNumberSpecification roomNumber = new RoomNumberSpecification(4);
		
	
		for (House house: houseList.getHousesBy(roomNumber)) {
			printHouseInfo(house);
		}
		
		System.out.println("-----------------------------------------------");
				
		System.out.println("Display houses/flats where room numbers equal 4 and have locations from 2 to 10");
		
		roomNumber = new RoomNumberSpecification(3);
		FloorSpecification floorSpecification = new FloorSpecification(2, 10);
		AndSpecification andSpecification = new AndSpecification(roomNumber, floorSpecification);
		
		for (House house: houseList.getHousesBy(andSpecification)) {
			printHouseInfo(house);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Display houses/flats where apartment area is bigger then 70");
		
		ApartmentAreaSpecification apartmentAreaSpecification = new ApartmentAreaSpecification(70);
		
		for (House house: houseList.getHousesBy(apartmentAreaSpecification)) {
			printHouseInfo(house);
		}
		
	}

	private static void printHouseInfo(House house) {
		System.out.println("House ID: " + house.id);
	}
}
