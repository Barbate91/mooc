import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                return;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                this.list.add(scanner.nextLine());
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                this.list.remove(Integer.parseInt(scanner.nextLine()));
            }
        }
    }
}
