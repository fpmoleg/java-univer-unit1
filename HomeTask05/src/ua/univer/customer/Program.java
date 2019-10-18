package ua.univer.customer;

public class Program {

	public static void main(String[] args) {
		
		CustomerList customers = new CustomerList();
		
		customers.addCustomer(new Customer(1, "Bate", "Maya", "4242 Joy Lane", 129, "1234567890"));
		customers.addCustomer(new Customer(2, "Mariah", "Hollis", "2710 Blackwell Street", 16, "1234567890"));
		customers.addCustomer(new Customer(3, "Forrest", "Reeve", "3446 Strother Street", 11, "1234567890"));
		customers.addCustomer(new Customer(4, "Saffa", "Marin", "699 Arlington Avenue", 56, "1234567890"));
		customers.addCustomer(new Customer(5, "Clark", "Sims", "4607 Burnside Court", 28, "1234567890"));
		customers.addCustomer(new Customer(6, "Caio", "Cisneros", "223 Duck Creek Road", 6, "1234567890"));
		customers.addCustomer(new Customer(7, "Monique", "Rayner", "203 Stark Hollow Road", 65, "1234567890"));
		customers.addCustomer(new Customer(8, "Aneurin", "Solis", "4284 Bedford Street", 133, "1234567890"));
		customers.addCustomer(new Customer(9, "Carley", "Thorpe", "4860 Goodwin Avenue", 43, "1234567890"));
		customers.addCustomer(new Customer(10, "Bate", "Maya", "4860 Goodwin Avenue", 17, "1234567890"));
		customers.addCustomer(new Customer(11, "Patrycja", "Cole", "4396 Hart Country Lane", 137, "1234567890"));
		customers.addCustomer(new Customer(12, "Eben", "Mckeown", "4955 Coffman Alley", 143, "1234567890"));
		
		System.out.println("Order customers full name:");
		
		for (Customer customer : customers.getCustomersOderByFullName()) {
			printCustomer(customer);
		}
		
		System.out.println("=================================");
		
		System.out.println("Find customers by card range (15, 100):");
		
		for (Customer customer : customers.getCustomersByCardRange(15, 100)) {
			printCustomer(customer);
		}
	}

	private static void printCustomer(Customer customer) {
		System.out.println("Full name: " + customer.getFullname());
		System.out.println("Address: " + customer.getAddress());
		System.out.println("Card number: " + customer.getCardNumber());
		System.out.println("Bank number: " + customer.getBankNumber());
	}

}
