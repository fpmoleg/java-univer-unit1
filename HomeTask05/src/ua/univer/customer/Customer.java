package ua.univer.customer;

public class Customer implements Comparable<Customer>{
	public final int ID;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private int cardNumber;
	
	private String bankNumber; 
	
	public Customer(final int id, String firstName, String lastName, String address, int cardNumber, String bankNumber) {
		this.ID = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankNumber = bankNumber;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getBankNumber() {
		return bankNumber;
	}
	
	public String getFullname() {
		return this.firstName + " " + this.lastName;
	}
	
	public int compareTo(Customer otherCustomer) {
		return this.getFullname().compareTo(otherCustomer.getFullname());
	}
}