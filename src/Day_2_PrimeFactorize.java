import java.util.Scanner;

public class Day_2_PrimeFactorize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int d = 2;
        while(num>1) {
            if (num % d == 0) {
                System.out.println(d);
                num /= d;
            } else {
                d++;
            }
        }
    }

}
