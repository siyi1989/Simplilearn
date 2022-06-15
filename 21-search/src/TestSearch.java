
public class TestSearch {

	public static void main(String[] args) {
		int [] arr= {8,9,12,15,17,19,20,21,28};
		//Searching.linearSearch(arr, 19);
		//Searching.binarySearch(arr, 19);
		int result=Searching.exponentialSearch(arr, arr.length, 19);
		System.out.println("element is present at index: "+result);
		
	}

}
