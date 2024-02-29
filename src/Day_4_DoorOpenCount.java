import java.util.Scanner;

public class Day_4_DoorOpenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int answer = (int)Math.sqrt(num);
        System.out.println(answer);
    }
}
