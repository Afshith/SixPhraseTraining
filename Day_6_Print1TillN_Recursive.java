import java.util.*;

public class Day_6_Print1TillN_Recursive {

    public static void printTillN(int n) {

        if(n == 0) {
            return;
        }

        printTillN(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printTillN(n);

    }

}