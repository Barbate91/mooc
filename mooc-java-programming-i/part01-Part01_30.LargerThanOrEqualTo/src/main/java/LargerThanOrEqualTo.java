
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scan.nextLine());
        int greater;
        if (first > second) {
            greater = first;
            System.out.println("Greater number is: " + greater);
        } else if (first < second) {
            greater = second;
            System.out.println("Greater number is: " + greater);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}