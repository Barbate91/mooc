
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1"))
                break;
            inputs.add(input);
        }
        inputs.stream()
                .mapToInt(Integer::valueOf)
                .filter(i -> i >= 1 && i <= 5)
                .forEach(System.out::println);
    }
}
