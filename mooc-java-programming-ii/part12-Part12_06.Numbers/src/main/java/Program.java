
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        String input = scanner.nextLine();
        int numberToPrint = Integer.parseInt(input);
        Random random = new Random();
        for (int i = 0; i < numberToPrint; i++) {
            int randomNumber = random.nextInt(11);
            System.out.println(randomNumber);
        }
    }


}
