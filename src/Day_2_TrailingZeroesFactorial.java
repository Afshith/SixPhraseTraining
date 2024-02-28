import java.util.Scanner;

public class Day_2_TrailingZeroesFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int num1 = 5;
        int trailingSum= 0;
        while(num1<=num){
            trailingSum += num/num1;
            num1*=5;
        }
        System.out.println(trailingSum);
    }
}
