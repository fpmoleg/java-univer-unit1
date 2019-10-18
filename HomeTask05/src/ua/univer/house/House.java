package ua.univer.house;

public class House {
	public final int id;
	
	private int apartmentNumber;
	
	private int apartmentArea;
	
	private int floor;
	
	private int roomNumbers;
	
	private String street;
	
	private String typeOfBuilding;
	
	private int lifetime;
	
	public House(int id, int apartmentNumber, int apartmentArea, int floor,
			int roomNumbers, String street, String typeOfBuilding, int lifetime) 
	{
		this.id = id;
		this.apartmentArea = apartmentNumber;
		this.floor = floor;
		this.roomNumbers = roomNumbers;
		this.street = street;
		this.typeOfBuilding = typeOfBuilding;
		this.lifetime = lifetime;
	}
	
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	
	public int getApartmentArea() {
		return apartmentArea;
	}
	
	public int getFloor() {
		return floor;
	}
		
	public int getRoomNumbers() {
		return roomNumbers;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}
	
	public int getLifetime() {
		return lifetime;
	}
}

