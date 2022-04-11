public class Statistics {
    
//    public float average (int num) { .}
    
    public float average (int...nums) {
        int sum = 0 ;
        float result = 0;
        if (nums.length > 0) {
            for (int x : nums) {
                sum += x;
            }
            result = (float) sum / nums.length;
        }
        return result;
    }
}
