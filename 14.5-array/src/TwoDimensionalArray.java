
public class TwoDimensionalArray {

	public void deleteValueFromArray(int row,int col) {
		try {
			System.out.println("successfully deleted: "+arr[row][col]);
			arr[row][col]=Integer.MIN_VALUE;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invlaid index for 2D array");
	}
	}
	public void searchingValue(int value) {
		 for (int i=0;i<arr.length;i++) {
			 for (int j=0;j<arr[i].length;j++) {
				 if(arr[i][j]==value) {
					 System.out.println("value is found at row: "+i+"col"+j);
					 return;
				 }
			 }
			 System.out.println("value is not found");
		 }
	}


	public void accessCell (int row,int col) {
		System.out.println("\nAccessing Row#"+row+", Col#"+col);
		try {
			System.out.println("Cell value is : "+arr[row][col]);

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invlaid index for 2D array");
		}
	}

	public void insertValueInArray(int row,int col,int value) {
		try {
			if(arr[row][col]==Integer.MIN_VALUE) {
				arr[row][col]=value;
				System.out.println("the value is successfully inserted");

			}else {
				System.out.println("this cell is already occupied");

			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index for 2D array");

		}
	}
	public void traverse2DArray() {
		 for (int[] element : arr) {
			 for (int j=0;j<element.length;j++) {
				 System.out.print(element[j]+" ");
			 }
			 System.out.println();
		 }
	}
	int[][] arr=null;

	public TwoDimensionalArray(int row,int col) {
		this.arr=new int[row][col];

		//defaul value for 2 dimensional array
		 for (int i=0;i<arr.length;i++) {
			 for (int j=0;j<arr[i].length;j++) {
				 arr[i][j]=Integer.MIN_VALUE;
			 }
		 }
	}
}
