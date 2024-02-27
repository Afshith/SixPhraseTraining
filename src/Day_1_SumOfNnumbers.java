import java.util.Scanner;

public class Day_1_SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int answer = (num * (num +1))/2;
        System.out.println("answer:" + answer);
    }
}
