import java.util.Scanner;

public class Day_1_RepresentAsWholeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int result = num +1 ;
        System.out.println("answer:" + (result * (result +1))/2);
    }
}
