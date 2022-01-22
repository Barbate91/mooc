
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            String operation = split[0];
            int value = Integer.parseInt(split[1]);

            if (operation.equals("add")) {
                if (value < 0)
                    continue;
                firstContainer += value;
                if (firstContainer > 100)
                    firstContainer = 100;
            } else if (operation.equals("move")) {
                if (value < 0)
                    continue;
                if (value > firstContainer)
                    value = firstContainer;
                firstContainer -= value;
                secondContainer += value;
                if (secondContainer > 100)
                    secondContainer = 100;
            } else if (operation.equals("remove")) {
                if (value < 0)
                    continue;
                secondContainer -= value;
                if (secondContainer < 0)
                    secondContainer = 0;
            }
        }
    }

}
