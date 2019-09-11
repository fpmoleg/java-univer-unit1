package ua.univer.tasks.integer;

public class IntegerTasks {
	public static int task3(int fileSize) {
		return fileSize / 1024;
	}

	public static void task8(byte number) {
		System.out.println("Incoming number: " + number);
		byte a = (byte) (number / 10), 
			 b = (byte) (number % 10);
		
		byte c = (byte) (b * 10 + a);
		
		System.out.println("Result: " + c);
	}
	
	public static void task11(short number) {
		byte digitalPositionH = (byte) (number / 100),
			 tens = (byte) (number - digitalPositionH * 100);
		
		byte digitalPositionD = (byte) (tens / 10),
			 digitalPositionO =	(byte) (tens % 10);
		
		System.out.println("Summ of digits:" + (digitalPositionH + digitalPositionD + digitalPositionO));
		System.out.println("Mult of digits:" + (digitalPositionH * digitalPositionD * digitalPositionO));
	}
	
	public static void task24(short day) {
		
		byte weekDay = (byte) (day % 7);
		
		System.out.println("Week day's: " + weekDay );
	}
	
	public static void task29(int a, int b, int c) {
		int rectangleArea = a * b,
			foursqareAmount = (a / c) * (b / c),
			totalFoursqareArea = foursqareAmount * (int) Math.pow(c, 2);

		System.out.println("Foursqare amount: " + foursqareAmount);
		System.out.println("Free area: " + (rectangleArea - totalFoursqareArea));
	}
}
