package ua.univer.customer.specification;

import ua.univer.customer.Customer;

public class CardSpecification implements Specification{
	private int cardNumberFrom;
	
	private int cardNumberTo;
	
	public CardSpecification(int from, int to) {
		this.cardNumberFrom = from;
		this.cardNumberTo = to;
	}
	
	@Override
	public boolean isSatisfiedBy(Customer customer) {
		
		if (customer.getCardNumber() > this.cardNumberTo) {
			return false;
		}
		
		if (customer.getCardNumber() < this.cardNumberFrom) {
			return false;
		} 
		
		return true;
	}
}