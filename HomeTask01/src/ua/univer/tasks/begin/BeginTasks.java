package ua.univer.tasks.begin;

public class BeginTasks {
	
	public static void task17(int a, int b, int c) {
		int ac = Math.abs(c - a),
			bc = Math.abs(c - b);
		
		System.out.println("AC: " + ac);
		System.out.println("BC: " + bc);
		
		System.out.println("Summ of AB and BC:" + (ac + bc));
	}
	
	public static void task22(int a, int b) {
		System.out.println("A: " + a + " B: " + b);
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("A: " + a + " B: " + b);
	}
	
	public static void task27(int a) {
		int b = a * a;
		
		System.out.println("A in 2nd power: " + b);
		
		b = b * b;
		
		System.out.println("A in 4th power: " + b);
		
		b = b * b;
		
		System.out.println("A in 8th power: " + b);
	}
}
