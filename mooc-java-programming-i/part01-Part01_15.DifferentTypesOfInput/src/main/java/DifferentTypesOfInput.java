
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String respStr = scan.nextLine();

        System.out.println("Give an integer:");
        int respInt = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double respDouble = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean respBool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + respStr);
        System.out.println("You gave the integer " + respInt);
        System.out.println("You gave the double " + respDouble);
        System.out.println("You gave the boolean " + respBool);
    }
}
