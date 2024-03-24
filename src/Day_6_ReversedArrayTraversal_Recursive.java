public class Day_6_ReversedArrayTraversal_Recursive {

    public static void reverseTraversal(int arr[], int index) {

        if(index == arr.length) {
            return;
        }

        reverseTraversal(arr, index + 1);
        System.out.print(arr[index] + " ");

    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseTraversal(arr,0);

    }

}