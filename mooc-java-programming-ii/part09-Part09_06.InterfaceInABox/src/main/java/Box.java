import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> itemsInBox = new ArrayList<>();

    public Box(double capacity) {
        this.capacity = capacity;
    }

    public void add(Packable item) {
        if (this.weight()+item.weight() <= this.capacity) {
            this.itemsInBox.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item :
                this.itemsInBox) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
