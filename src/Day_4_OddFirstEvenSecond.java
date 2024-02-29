import java.util.Scanner;

public class Day_4_OddFirstEvenSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int left = 0,right = 0, phaseL = 1,phaseR = 1,rem=0;
        while(num>0){
            rem = num % 10;
            if(rem % 2 == 1){
                left = left + (rem * phaseL);
                phaseL*=10;
            }
            else if(rem % 2 == 0){
                right = right + (rem * phaseR);
                phaseR*=10;
            }
            num/=10;
        }
        System.out.println(left * phaseR + right);
    }
}
