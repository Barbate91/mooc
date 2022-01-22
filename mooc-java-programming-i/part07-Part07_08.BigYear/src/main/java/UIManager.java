import java.util.Scanner;

public class UIManager {
    private Scanner scanner;
    BirdManager birdManager = new BirdManager();

    public UIManager(Scanner scan) {
        scanner = scan;
    }

    public void init() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit"))
                break;
            handleInput(input);
        }
    }

    private void handleInput(String input) {
        if (input.equals("Add")) {
            System.out.print("Name: ");
            String commonName = scanner.nextLine();
            System.out.print("Name in Latin: ");
            String latinName = scanner.nextLine();
            birdManager.addBird(commonName, latinName);
        } else if (input.equals("Observation")) {
            System.out.print("Bird? ");
            String birdCommonName = scanner.nextLine();
            birdManager.addObservation(birdCommonName);
        } else if (input.equals("All")) {
            birdManager.printAllBirds();
        } else if (input.equals("One")) {
            System.out.print("Bird? ");
            String birdCommonName = scanner.nextLine();
            System.out.println(birdManager.printOneBird(birdCommonName));
        }
    }
}
