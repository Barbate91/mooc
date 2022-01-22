
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String file = "literacy.csv";
        try {
            Files.lines(Paths.get(file))
                    .map(parts -> parts.split(","))
                    .sorted((p1,p2) -> p1[5].compareTo(p2[5]))
                    .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[2].split(" ")[1].trim() + ", " + parts[5]));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
