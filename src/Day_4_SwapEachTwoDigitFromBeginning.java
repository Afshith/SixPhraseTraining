import java.util.Scanner;

public class Day_4_SwapEachTwoDigitFromBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int length = (int)Math.log10(num)  + 1 -2;
        int answer = 0;

        while(length >= 0){
            int powValue = (int)Math.pow(10,length);
            int value = num / powValue;
            int digit1 = (value % 100)%10;
            int digit2 = (value % 100)/10;
            answer =  (answer * 100) + ((digit1 * 10) + digit2);
            length-=2;
        }
        if(length == -1){
            System.out.println((answer*10) + (num %10));
        }
        else{
            System.out.println(answer);
        }
        }


    }

