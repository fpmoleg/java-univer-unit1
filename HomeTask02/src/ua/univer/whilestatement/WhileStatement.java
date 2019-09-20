package ua.univer.whilestatement;

public class WhileStatement {
	public static void task1(int a, int b) {
		int count = b,
			freeSize = 0;
		
		while (count < a) {
			count = count + b;
		}
		
		freeSize = a - count + b;
		
		System.out.println("Free part of A is: " + freeSize);
	}
	
	public static void task7(int n) {
		int squaredNumber = 1,
			number = 1;
		
		while (squaredNumber < n) {
			number++;
			squaredNumber = number * number;
		}
		
		number--;
		
		System.out.println("The smallest integer number is " + number);
	}
	
	public static void task11(int n) {
		int sum = 0,
			k = 1;
		
		while (sum < n) {
			sum = sum + k;
			k++;
		}
		
		System.out.println("K: " + k);
		System.out.println("Sum: " + sum);
	}
	
	public static void task17(int number) {		
		while (number > 0) {
			System.out.print(number % 10 + " ");
			number = number / 10;
		}	
	}
}
