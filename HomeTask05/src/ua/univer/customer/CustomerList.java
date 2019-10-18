package ua.univer.customer;

import java.util.Arrays;

import ua.univer.customer.specification.CardSpecification;

public class CustomerList {
	private static final byte BUFFER_SIZE = 10;
	
	private int size = 0;
	
	private Customer[] customers;
	
	public CustomerList() {
		this.customers = new Customer[BUFFER_SIZE];
	}
	
	public boolean addCustomer(Customer customer) {
		if (size < BUFFER_SIZE) {
			this.customers[size++] = customer;
			return true;
		}
		
		return false;
	}
	
	public Customer[] getCustomersOderByFullName() {
		Arrays.sort(this.customers);
		
		return this.customers;
	}
	
	public Customer[] getCustomersByCardRange(int from, int to) {
		Customer[] result = new Customer[BUFFER_SIZE];
		
		CardSpecification specification = new CardSpecification(from, to);
		
		int i = 0;
		
		for (Customer customer : this.customers) {
			if (specification.isSatisfiedBy(customer)) {
				result[i++] = customer;
			}
		}
		
		result = Arrays.copyOfRange(result, 0, i);
		
		return result;
	}
}