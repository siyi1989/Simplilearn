
public class TestSort {

	public static void main(String[] args) {
		int[] array= {10,7,3,2,5,8,4,1,9,6};
		
		QuickSort.sort(array,0,array.length-1);
		QuickSort.printArray(array);
		
		//mergeSort.sort(array,0,array.length-1);
		//mergeSort.printArray(array);
		
		//InsertionSort.sort(array);
		//InsertionSort.printArray(array);
		
		//BubbleSort.sort(array);
		//BubbleSort.printArray(array);
		
		//SelectionSort.sort(array);
		//SelectionSort.printArray(array);
		}

	}

