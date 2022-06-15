//insertion sort->time consuming
//divide given array into 2 parts
//take 1st element from unsorted array and find its correct position in sorted array
//repeat until unsorted array is empty
public class InsertionSort {

	public static void printArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void sort(int[] array) {
		for (int i=0;i<array.length;i++) {
			int temp=array[i],j=i;
			while(j>0 && array[j-1]>temp) {
				array[j]=array[j-1];
				j--;
				
			}
			array[j]=temp;
			}
	}
}

	