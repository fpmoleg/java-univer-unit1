package ua.univer.helper;

import java.util.Arrays;

public class Helper {
	public static void fillArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
	}
	
	public static void printArray(int array[]) {
		System.out.println(Arrays.toString(array));
	}
}
