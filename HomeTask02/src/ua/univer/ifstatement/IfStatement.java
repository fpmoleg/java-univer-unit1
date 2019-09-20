package ua.univer.ifstatement;

public class IfStatement {
	public static void task14(int a, int b, int c) {
		int min = Math.min(Math.min(a, b), c),
			max = Math.max(Math.max(a, b), c);
		
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
	}
	
	public static void task15(int a, int b, int c) {
		int min = Math.min(Math.min(a, b), c);
		
		System.out.println("The sum of 2 bigger numbers is : " + (a + b + c - min));
	}
	
	public static double task26(double x) {
		if (x <= 0) {
			return -x;
		} else {
			if ((x > 0) && (x < 2)) {
				return Math.pow(x, 2);
			} else {
				return (double) 4;
			}
		}
	}
	
	public static byte task27(float x) {
		int round = (int) Math.floor(x);
		
		if (round < 0) {
			return 0;
		} else {
			if ((round & 1) == 0) {
				return 1;
			} 
		
			return (byte) -1;
		}
	}
}
