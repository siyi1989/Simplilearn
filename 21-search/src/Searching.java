//reference: https://www.cs.usfca.edu/~galles/visualization/Algorithms.html

import java.util.Arrays;

public class Searching {

	
	public static int exponentialSearch(int[] arr,int length, int value) {
		
		if(arr[0]==value) {
			return 0;
			
		}
		//find range for binary search
		int i=1;
		while (i<length && arr[i]<=value) {
			i=i*2;
			
		}
		return Arrays.binarySearch(arr,(i/2),Math.min(i, length),value);
	}
	public static int binarySearch(int[] arr,int value) {
		int start=0;
		int end=arr.length-1;
		int middle=(start+end)/2;
		
		System.out.println(start+" "+middle+" "+end);
		
		while (arr[middle]!=value && start<=end) {
			if(value<arr[middle]) {
				end=middle-1;
				
			}else {
				start=middle+1;
			}
			middle=(start+end)/2;
			System.out.println(start+" "+middle+" "+end);
		}
		if(arr[middle]==value) {
			System.out.println("the element is found at index: "+middle);
			return middle;
		}else {
			System.out.println("element "+value+ "not found");
			return -1;
		}
	}
	
		
	public static int linearSearch(int[] arr,int value) {
		for (int i=0;i<arr.length;i++) {
			System.out.println("element is found at index:"+i);
			return i;
		}
		System.out.println("element "+value+"not found");
		return -1;
	}

	
	
}
