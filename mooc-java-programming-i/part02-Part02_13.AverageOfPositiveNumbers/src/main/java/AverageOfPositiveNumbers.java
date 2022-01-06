
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int count = 0;
        int sum = 0;
        while (number != 0) {
            number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                count++;
                sum += number;
            }
        }
        if (sum > 0) {
            System.out.println((double)sum/(double)count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
