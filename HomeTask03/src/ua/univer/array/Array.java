package ua.univer.array;

import java.util.Arrays;

import ua.univer.helper.Helper;

public class Array {
	
	public static void task16() {
		int array[] = new int[10];
		
		Helper.fillIntArray(array);
		Helper.printArray(array);
		
		for (int i = 0; i < array.length / 2; i++) {
			System.out.println(array[i]);
			System.out.println(array[array.length - 1 - i]);
		}	
	}
	
	public static void task51() {
		int a[] = new int[10],
			b[] = new int[10];
		
		Helper.fillIntArray(a);
		Helper.fillIntArray(b);
		
		Helper.printArray(a);
		Helper.printArray(b);

		for (byte i = 0; i < a.length; i++) {
			b[i] = a[i] ^ b[i];
			a[i] = a[i] ^ b[i];
			b[i] = a[i] ^ b[i];
		}
		
		Helper.printArray(a);
		Helper.printArray(b);
	}
	
	public static void task55() {
		int a[] = new int[15],
			b[] = new int[15];
		
		byte j = 0;
		
		Helper.fillIntArray(a);
		Helper.printArray(a);
			
		for (byte i = 1; i < a.length; i = (byte)(i + 2)) {
			b[j++] = a[i];
		}
		
		b = Arrays.copyOf(b, j);
		
		Helper.printArray(b);
	}
	
	public static void task62() {
		int a[] = new int[10],
			b[] = new int[10],
			c[] = new int[10];
		
		Helper.fillIntArrayWithNegative(a);
		Helper.printArray(a);
		
		int j = 0, 
			k = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				c[k++] = a[i];
			} else {
				b[j++] = a[i];
			}
		}
		
		b = Arrays.copyOf(b, j);
		c = Arrays.copyOf(c, k);
		
		Helper.printArray(b);
		Helper.printArray(c);
	} 

	public static void task63() {
		int a[] = new int[5],
			b[] = new int[5],
			c[] = new int[a.length + b.length];
		
		Helper.fillIntArray(a);
		Helper.fillIntArray(b);
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i = 0,
			j = 0,
			k = 0;
		
		while ((i < a.length) && (j < b.length) ){
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		
		if (i < a.length) {
			while (k < c.length) {
				c[k++] = a[i++];
			}
		} else {
			while (k < c.length) {
				c[k++] = b[j++];
			}
		}
		
		Helper.printArray(a);
		Helper.printArray(b);
		Helper.printArray(c);	
	}
}
