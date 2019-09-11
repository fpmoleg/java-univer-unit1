package ua.univer.tasks.bool;

public class BoolTasks {
	
	public static void task10(int a, int b) {		
		if ( ((a & 1) == 1) ^ ((b & 1) == 1) ) {
			System.out.println("Only one number is even");
		} else {
			System.out.println("All numbers are even or no one");
		}
	}
	
	public static void task32(int a, int b, int c) {
		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			if ((a == b) || (a == c) || (b == c)) {
				System.out.println("The triangle is isosceles");
			} else {
				System.out.println("The triangle isn't isosceles");
			}
		} else  {
			System.out.println("Wrong values for triangle' sides");
		}
	}
	
	public static void task34(byte x, byte y) {
		if ( ((x & 1) == 1) ^ ((y & 1) == 1) ) {
			System.out.println("The field is white");
		} else {
			System.out.println("The field is black");
		}
	}
	
	public static void task40(byte x1, byte y1, byte x2, byte y2) {
		byte diffX = (byte) Math.abs( x2 - x1 ),
			 diffY = (byte) Math.abs( y2 - y1 );
		
		if (Math.abs(diffY - diffX) == 1) {
			System.out.println("The knight can move");
		} else {
			System.out.println("The knight cann't move");
		}		
	}
}
