import java.util.Arrays;

public class Day_5_ReverseEachGroup {
    public static void main(String[] args) {
        int[] arr = {10,2,5,6,7,8,90,99};
        int k = 4;
        int start = 0,end = k-1;
        while(end<=arr.length){
            reverseArray(arr,start,end);
            start+=k;
            end+=k;
        }

        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
