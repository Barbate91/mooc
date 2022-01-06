
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its content printed?");
        String input = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(input))) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
