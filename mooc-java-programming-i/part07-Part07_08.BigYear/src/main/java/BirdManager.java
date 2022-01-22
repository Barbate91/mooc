import java.util.ArrayList;

public class BirdManager {
    ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(String commonName, String latinName) {
       birds.add(new Bird(commonName, latinName));
    }

    public void addObservation(String birdName) {
        int hits = 0;
        for (Bird bird :
                birds) {
            if (bird.getNameCommon().equals(birdName)) {
                bird.addObservation();
                hits++;
            }
        }
        if (hits == 0)
            System.out.println("Not a bird!");
    }

    public void printAllBirds() {
        for (Bird bird :
                birds) {
            System.out.println(bird.toString());
        }
    }

    public String printOneBird(String birdName) {
        for (Bird bird :
                birds) {
            if (bird.getNameCommon().equals(birdName))
                return bird.toString();
        }
        return "Not a bird!";
    }
}
