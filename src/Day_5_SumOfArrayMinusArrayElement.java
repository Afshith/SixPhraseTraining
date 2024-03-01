import java.lang.reflect.Array;
import java.util.Arrays;

public class Day_5_SumOfArrayMinusArrayElement {
    public static void main(String[] args) {
        int[] arr = {10,2,5,6,7,8};

        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sum-arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
