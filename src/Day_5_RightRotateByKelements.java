import java.util.Arrays;

public class Day_5_RightRotateByKelements {
    public static void main(String[] args) {
        int[] arr = {10,2,5,6,7,8,90,99};
        int k = 3;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
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
