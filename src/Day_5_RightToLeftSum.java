import java.util.Arrays;

public class Day_5_RightToLeftSum {
    public static void main(String[] args) {
        int[] arr = {10,2,5,6,7,8};
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = sum;
            sum+=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
