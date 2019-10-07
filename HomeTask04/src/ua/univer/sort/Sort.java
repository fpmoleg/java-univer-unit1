package ua.univer.sort;

import java.util.Arrays;

public class Sort {
	public static void bubbleSort(int array[]) {
		int tmp;
		
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					tmp          = array[j];
					array[j]     = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
	
	public static void selectionSort(int array[]) {
		int min, tmp;
		
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}				
			}
			
			tmp        = array[i];
			array[i]   = array[min];
			array[min] = tmp;
		}
	}
	
	public static void insertionSort(int array[]) {
		int j, temp;
		
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			
			while(j > 0 && array[j-1] > temp) {
				array[j] = array[j-1];
				j--;
			}
			
			array[j] = temp;
		}
	}
	
	public static void quickSort(int array[], int left, int right) {
		if (array.length == 0) {
			return;
		}
		
		if (left >= right) {
			return;
		}
		
		int i = left,
			j = right,
			needle = array[(left + right) / 2];
		
		while (i <= j) {
			while (array[i] < needle) {
				i++;
			}
			while (array[j] > needle) {
				j--;
			}
			
			if (i <= j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i++;
				j--;
			}
		}
		
		if (left < j) {
			quickSort(array, left, j);
		}
		
		if (right > i) {
			quickSort(array, i, right);
		}
	}

	public static int[] mergeSort(int array[]) {
		if (array.length < 2) {
			return array;
		}
		
		int middle = array.length / 2;
		
		return merge(
			mergeSort(Arrays.copyOfRange(array, 0, middle)),
			mergeSort(Arrays.copyOfRange(array, middle, array.length))
		);
	}
	
	private static int[] merge(int part1[], int part2[]) {
		int size = part1.length + part2.length;
		int result[] = new int[size];
		
		int i = 0, j = 0, k = 0;

		while (i < part1.length && j < part2.length) {
			result[k++] = (part1[i] < part2[j]) ? part1[i++] : part2[j++]; 
		}
		
		while (i < part1.length) {
			result[k++] = part1[i++];
		}
		
		while (j < part2.length) {
			result[k++] = part2[j++];
		}
		
		return result;
	}
}
