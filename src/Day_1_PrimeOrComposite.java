import java.util.Scanner;

public class Day_1_PrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("PRIME");
        }
        else{
            System.out.println("COMPOSITE");
        }
    }
    static boolean isPrime(int num){
        int c = 0;
        if(num == 2 ){
            return true;
        }
        int val = (int) Math.sqrt(num);
        for(int i = 3;i<=val;i+=2){
            if(num % i ==0 ){
                return false;
            }
        }
        return true;
    }
}
