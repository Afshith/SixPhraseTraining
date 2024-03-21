package sixPhaseTraining;
import java.util.*;

public class Day_6_PrintNTo1_Recursive {

    public static void printNTo1(int n) {

        if(n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNTo1(n - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printNTo1(n);

    }

}