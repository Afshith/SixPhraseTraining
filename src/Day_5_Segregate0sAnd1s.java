import java.util.Arrays;

public class Day_5_Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0};
        int j = arr.length - 1, i = 0;
        while (i < j) {
            if (arr[i] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                i++;
                continue;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
