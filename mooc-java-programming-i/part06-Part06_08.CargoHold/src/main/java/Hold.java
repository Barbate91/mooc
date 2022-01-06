import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int currentWeight = 0;
    private ArrayList<Suitcase> hold = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        this.currentWeight = 0;
        for (Suitcase suitcases :
                hold) {
            this.currentWeight += suitcases.totalWeight();
        }
        if (suitcase.totalWeight() <= (this.maxWeight-this.currentWeight))
            this.hold.add(suitcase);
    }

    public void printItems() {
        for (Suitcase suitcase :
                hold) {
            suitcase.printItems();
        }
    }

    public String toString() {
        this.currentWeight = 0;
        for (Suitcase suitcase :
                hold) {
            this.currentWeight += suitcase.totalWeight();
        }
        return hold.size() + " suitcases (" + this.currentWeight + " kg)";
    }
}
