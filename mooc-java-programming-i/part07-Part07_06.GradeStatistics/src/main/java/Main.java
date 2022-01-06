
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        StatCollection stats = new StatCollection();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1)
                break;
            stats.add(input);
        }
        System.out.println("Point average (all): " + stats.getTotal());

        double passing = stats.getPassing();
        if (passing == 0)
            System.out.println("Point average (passing): -");
        else
            System.out.println("Point average (passing): " + stats.getPassing());

        System.out.println("Pass percentage: " + stats.getPassingPercent());
        stats.gradeDistribution();
    }
}
