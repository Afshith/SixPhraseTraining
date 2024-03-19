
import java.util.*;

public class Day_6_CountOfSearchCharacter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("Enter the search character : ");
        char searchChar = sc.next().charAt(0);

        int occurenceCount = 0;

        for(int index = 0; index < str.length(); index++) {
            if(str.charAt(index) == searchChar) {
                occurenceCount++;
            }
        }

        System.out.println("The search character has occured " + occurenceCount + " times");

    }

}
