package ua.univer.switchstatement;

public class SwitchStamenent {
	public static String task1(byte n) {
		String result = "";
		
		switch (n) {
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturnday";
			break;
		case 7:
			result = "Sunday";
			break;
		default:
			result = "Undefined value";
			break;
		}
		
		return result;
	}
	
	public static float task5(float a, float b, byte command) {
		float result = 0;
		
		switch ( command ) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			break;
		}
		
		return result;
	}
}
