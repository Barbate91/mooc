
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] split = input.split(" ");
            String operation = split[0];
            int value = Integer.parseInt(split[1]);

            if (operation.equals("add")) {
                first.add(value);
            } else if (operation.equals("remove")) {
                second.remove(value);
            } else if (operation.equals("move")) {
                if (value > first.contains())
                    value = first.contains();
                first.remove(value);
                second.add(value);
            }
        }
    }

}
