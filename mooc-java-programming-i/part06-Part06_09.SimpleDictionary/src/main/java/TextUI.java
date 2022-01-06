import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                return;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated:");
                String translate = scanner.nextLine();
                String translated = this.dictionary.translate(translate);
                if (translated == null)
                    System.out.println("Word " + translate + " was not found");
                else
                    System.out.println("Translation: " + translated);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
