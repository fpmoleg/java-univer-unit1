import ua.univer.helper.Helper;
import ua.univer.sort.Sort;

public class HomeTaskCore {

	public static void main(String[] args) {
		int array[] = new int[15];
		/**
		 * Run Bubble Sort.
		 * */
		System.out.println("-----------------------");
		System.out.println("----- Bubble Sort -----");
		
		Helper.fillArray(array);
		Helper.printArray(array);
		
		Sort.bubbleSort(array);
		
		Helper.printArray(array);
		/**
		 * Run Selection Sort.
		 * */
		System.out.println("------------------------");
		System.out.println("---- Selection Sort ----");
		
		Helper.fillArray(array);
		Helper.printArray(array);
		
		Sort.selectionSort(array);
		Helper.printArray(array);
		
		/**
		 * Run Insertion Sort.
		 * */
		System.out.println("------------------------");
		System.out.println("---- Insertion Sort ----");
		
		Helper.fillArray(array);
		Helper.printArray(array);
		
		Sort.insertionSort(array);
		Helper.printArray(array);
		/**
		 * Run Quick Sort.
		 * */ 
		System.out.println("------------------------");
		System.out.println("------ Quick Sort ------");
		
		
		Helper.fillArray(array);
		Helper.printArray(array);
		
		int left = 0,
			right = array.length - 1;
		
		Sort.quickSort(array, left, right);
		
		Helper.printArray(array);
		/**
		 * Run Merge Sort.
		 * */
		System.out.println("------------------------");
		System.out.println("------ Merge Sort ------");
		
		Helper.fillArray(array);
		Helper.printArray(array);
		
		array = Sort.mergeSort(array);
		
		Helper.printArray(array);
	}

}
