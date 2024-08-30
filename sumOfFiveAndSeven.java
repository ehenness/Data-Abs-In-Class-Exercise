import java.lang.reflect.Array;

public class sumOfFiveAndSeven {
    private static int sumOf(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i%5 == 0 || i % 7 == 0 ) {
                sum += i;
            }
        }
        return sum;
    }


    private static boolean repeat(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length-1; j++){
                if (i == j){
                    return true;
                }
            }
        }
        return false;
    }


}
