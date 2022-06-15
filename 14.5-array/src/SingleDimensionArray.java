
public class SingleDimensionArray {

	int[] arr =null;
	
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex]=Integer.MIN_VALUE;
			System.out.println("The value has been deleted successfully");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("the value provided is not within index");
		}
	}
	
	public void searchInArray(int valueToSearch) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("value is found at the index of "+i);
				return;
				
			}
		}
		System.out.println(valueToSearch+" is not found");
		
	}
	
	public void insert(int location, int valueToBeInserted) {
        try {
            if ( arr[location] == Integer.MIN_VALUE ) {
                arr[location] = valueToBeInserted;
                System.out.println("successfully inserted");
            }else {
                System.out.println("this cell is already  ocupied");
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index to access array!");
        }
    }
	
	public SingleDimensionArray(int sizeofArray) {
		arr=new int[sizeofArray];
		
		for (int i=0; i< arr.length;i++) {
			arr[i]=Integer.MIN_VALUE;
			
		}
	}
	
	public void traverseArray() {
		try {
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i] +" ");
				
			}}catch(Exception e) {
				System.out.println("array no longer exists!");
				
			}
		}
	}

