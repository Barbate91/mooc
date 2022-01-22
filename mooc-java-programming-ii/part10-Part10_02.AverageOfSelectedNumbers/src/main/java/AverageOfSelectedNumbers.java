
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        System.out.println("Print the average of the negative numbers of the positive numbers? (n/p)");
        String response = scanner.nextLine();
        if (response.equals("n")) {
            double averageNegative = inputs.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageNegative);
        } else if (response.equals("p")){
            double averagePositive = inputs.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averagePositive);
        }
    }
}
