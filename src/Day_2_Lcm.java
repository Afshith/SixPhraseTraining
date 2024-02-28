import java.util.Scanner;

public class Day_2_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any  2 Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println((num1*num2)/calculateGcd(num1,num2));
    }
    static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGcd(b, a % b);
        }
    }
}
