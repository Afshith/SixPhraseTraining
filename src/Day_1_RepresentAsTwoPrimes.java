import java.util.Scanner;

public class Day_1_RepresentAsTwoPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        if(num == 2){
            System.out.println("NO");
            return;
        }
        if (num % 2 == 0 && num != 4) {
            System.out.println("YES");
        } else if (isPrime(num - 2)) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }
    static boolean isPrime(int num){
        int c = 0;
        int val = (int) Math.sqrt(num);
        for(int i = 3;i<=val;i+=2){
            if(num % i ==0 ){
                return false;
            }
        }
        return true;
    }
}
