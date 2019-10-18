package ua.univer.customer.specification;

import ua.univer.customer.Customer;

public interface Specification {
	public boolean isSatisfiedBy(Customer customer);
}
