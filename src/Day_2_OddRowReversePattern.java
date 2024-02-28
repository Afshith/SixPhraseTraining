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
/* for n = 6
1
2 3
6 5 4
7 8 9 10
15 14 13 12 11
16 17 18 19 20 21*/
