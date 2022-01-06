
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] split = input.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("av")) {
                    System.out.println(split[i]);
                }
            }
        }
    }
}
