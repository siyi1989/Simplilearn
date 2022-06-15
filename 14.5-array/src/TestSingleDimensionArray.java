
public class TestSingleDimensionArray {
    public static void main(String[] args) {
        
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
        singleDimensionArray.traverseArray();
        
        
        singleDimensionArray.insert(0, 5);
        singleDimensionArray.insert(3, 2);
        singleDimensionArray.insert(4, 1);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(1, 4);
        singleDimensionArray.insert(5, 0);
        
//        singleDimensionArray.insert(0, 5);
        System.out.println();
        singleDimensionArray.traverseArray();
        
        System.out.println();
        singleDimensionArray.searchInArray(4);
        singleDimensionArray.searchInArray(10);
        
        System.out.println();
        
        singleDimensionArray.deleteValue(2);
        singleDimensionArray.traverseArray();
    }
}
