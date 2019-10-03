package ua.univer.helper;

import java.util.Arrays;

public class Helper {
	public static void fillIntArray(int array[]) {
		fillIntArray(array, 0);
	}
	
	public static void printArray(int array[]) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void fillIntArrayWithNegative(int array[]) {
		fillIntArray(array, 50);
	}
	
	private static void fillIntArray(int array[], int shift) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 - shift);
		}
	}
}
