
import java.lang.reflect.Array;
import java.util.Arrays;

public class Day_5_SumOfArrayMinusArrayElement {
    public static void main(String[] args) {
        int[] arr1 = {10,2,5,6,7,8};

        int sum = 0;
        for(int i:arr1){
            sum+=i;
        }
         for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sum-arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
