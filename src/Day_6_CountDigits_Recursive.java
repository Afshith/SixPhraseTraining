import java.util.*;

public class Day_6_CountDigits_Recursive {

    public static int countDigits(int num) {

        if(num == 0) {
            return 0;
        }

        int ans = countDigits(num / 10);
        return ans + 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int digits = countDigits(num);
        System.out.println("The number of digits in num is " + digits);

    }

}
