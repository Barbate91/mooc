
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program hered
        System.out.println("Give a number:");
        double response = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + response);
    }
}
