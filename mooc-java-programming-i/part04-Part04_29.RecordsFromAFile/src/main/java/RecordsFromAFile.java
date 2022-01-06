
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                String row = fileReader.nextLine();
                String[] split = row.split(",");
                String name = split[0];
                String age = split[1];
                if (Integer.parseInt(age) == 1)
                    System.out.println(name + ", age: " + age + " year");
                else
                    System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
