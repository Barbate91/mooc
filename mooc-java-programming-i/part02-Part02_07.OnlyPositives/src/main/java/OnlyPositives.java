
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        while (number != 0) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                System.out.println(number*number);
            } else if (number < 0) {
                System.out.println("Unsuitable number");
            }
        }
    }
}
