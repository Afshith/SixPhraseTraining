import java.util.Scanner;

public class Day_2_PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int d = 2;
        boolean printed = false;
        while (num > 1) {
            if (num % d == 0) {
                if (!printed) {
                    System.out.print(d + " ");
                    printed = true;
                }

                num /= d;
            } else {
                d++;
                printed = false;
            }
        }
    }
}
