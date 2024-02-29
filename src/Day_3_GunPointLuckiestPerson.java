import java.util.Scanner;

public class Day_3_GunPointLuckiestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int c = 0;
        while(Math.pow(2,c)<=num){
            c++;
        }
        if(Math.pow(2,c)== num){
            System.out.println("Answer: " + 1);
            return;
        }
        else{
            int value = (int)Math.pow(2,c-1);
            int Answer = 1;
            while(value<num){
                Answer+=2;
                value++;
            }
            System.out.println("Answer:" + Answer);
        }
    }
}
