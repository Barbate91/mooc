
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int second = Integer.valueOf(scanner.nextLine());
        if (second <= num) {
            for (int i=second; i<=num; i++) {
                System.out.println(i);
            }
        }
    }
}
