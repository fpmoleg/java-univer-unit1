package ua.univer.forstatement;

public class ForStatement {
	public static void task7(int a, int b) {
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			sum = sum + i; 
		}
		
		System.out.println("Sum from " + a + " to " + b + " is: " + sum );
	}
	
	public static void task11(int n) {
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum = sum + (int) Math.pow((i + n), 2);
		}
		
		System.out.println("The sum is: " + sum);
	}
	
	public static void task13(int n) {
		float sum  = 0;
		byte sign = 1;
		
		for (int i = 1; i <= n; i++) {			
			sum = sum + (1 + (float) ( i / 10.0 )) * sign;			
			sign = (byte) -sign;			
		}
		
		System.out.println("SUM is: " + sum);
	}
	
	public static void task40(int a, int b) {
		for (int i = a; i <= b; i++) {
			int count = (i - a + 1);
			for (int j = 0; j < count; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
