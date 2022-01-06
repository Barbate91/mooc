
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";
        for (int i=0; i<number; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spaces = "";
        for (int i = 0; i < number; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = (size-1); i >= 0 ; i--) {
            printSpaces(i);
            printStars(size-i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = 1;
        for (int i = (height-1); i >= 0 ; i--) {
            printSpaces(i);
            if (height-i == 1) {
                printStars((stars));
                stars += 2;
            } else {
                printStars(stars);
                stars += 2;
            }
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
