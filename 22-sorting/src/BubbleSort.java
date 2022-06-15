//bubble sort->used when data is mostly already sorted
//compare 2 data point and sort within the 2
//continue with next 2 set of data point

//reference- https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/

public class BubbleSort {

	public static void printArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void sort(int[] array) {
		int n=array.length;
		for (int i=0;i<n-1;i++) {
			for (int j=0;j<n-i-1;j++) {
			if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
	}
}
	}
}

	