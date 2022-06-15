public class TestTwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2, 2);
        System.out.println();
        twoDimensionalArray.traverse2DArray();
        
        twoDimensionalArray.insertValueInArray(0, 0, 1);
        twoDimensionalArray.insertValueInArray(0, 1, 2);
        twoDimensionalArray.insertValueInArray(1, 0, 3);
        twoDimensionalArray.insertValueInArray(1, 1, 4);
        
        twoDimensionalArray.traverse2DArray();
        
        System.out.println();
        twoDimensionalArray.accessCell(0, 0);
        
        System.out.println();
        twoDimensionalArray.searchingValue(3);
        
        twoDimensionalArray.deleteValueFromArray(0, 1);
        twoDimensionalArray.traverse2DArray();
    }
}

