
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = 0;
        String longestName = "";
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;
            String[] split = input.split(",");
            years += Integer.parseInt(split[1]);
            count++;
            if (split[0].length() > longestName.length())
                longestName = split[0];
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)years/(double)count);
    }
}
