import java.util.Scanner;

public class Day_2_OddRowReversePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int c = 0;
        for(int i = 1;i<=num;i++){
            if( i % 2 == 1){
                int val = c + i;
                int val2 = c;
                for(int j = val;j>val2;j--){
                    System.out.print(j + " ");
                    ++c;
                }
            }
            else{
                for(int k = 1;k<=i;k++){
                    System.out.print( ++c + " ");
                }
            }
            System.out.println();
        }
    }
}
