package ua.univer.minmax;

import ua.univer.helper.Helper;

public class MinMax {
	
	public static void task14(int b) {
		int array[] = new int[10],
			min = 0;
		
		byte position = -1;
		
		Helper.fillIntArray(array);
		Helper.printArray(array);
		
		for (byte i = 0; i < array.length; i++) {
			if (b < array[i]) {
				if (position == -1) {
					min = array[i];
					position = i;
				} else {
					if (min > array[i]) {
						min = array[i];
						position = i;
					}
				}
			} 
		}
		
		if (position == -1) {
			System.out.println("00");
		} else {
			System.out.println("Min: " + min + ", position: " + position);
		}
	}
	
	public static void task22() {
		int array[] = new int[10];
		
		Helper.fillIntArray(array);
		Helper.printArray(array);
		
		int min1, min2;
		
		if (array[0] < array[1]) {
			min1 = array[0];
			min2 = array[1];
		} else {
			min1 = array[1];
			min2 = array[0];
		}
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min2) {
				if (array[i] < min1) {
					min1 = array[i];
				} else {			
					min2 = array[i];
				}
			}
		}
		
		System.out.println("Min 1 is: " + min1);
		System.out.println("Min 2 is: " + min2);
	}
	
	public static void task28() {
		byte array[] = {0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1};
		
		int count = 0,
			position = 0,
			maxLength = 0;
		    
		
		for (int i = 0; i < array.length; i++) {
			if (array[ i ] == 1) {
				count++;
			} else {
				if (count >= maxLength) {
					if (count > maxLength) {
						maxLength = count;
					}
					
					position = i - count;
				}
				
				count = 0;
			}
		}
		
		System.out.println("Max number of 1 is: " + maxLength);
		System.out.println("Position starts from " + position);
	}	
}
