import java.util.Scanner;

public class Day_1_DivisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int n1 = 3,n2 = 5;
        int val1 = num / n1, val2 = num / n2;
        int result1 = ((val1 * (val1 + 1)) / 2) * n1;
        int result2 = ((val2 * (val2 + 1)) / 2) * n2;
        int minusValLcm = (n1* n2) / calculateGcd(n1, n2);
        System.out.println(minusValLcm);
        int val3 = num / minusValLcm;
        int result3 =  ((val3 * (val3 + 1)) / 2) * minusValLcm;

        System.out.println("Answer:" + (result1 + result2 - result3));


    }

    static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGcd(b, a % b);
        }
    }
}
