import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int currentWeight = 0;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
       if (canAddItem(item))
           items.add(item);
       calculateCurrentWeight();
    }

    public boolean canAddItem(Item item) {
        calculateCurrentWeight();
        if (this.currentWeight+item.getWeight() <= maxWeight)
            return true;
        else
            return false;
    }

    private void calculateCurrentWeight() {
        this.currentWeight = 0;
        for (Item item :
                items) {
            this.currentWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item :
                items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        calculateCurrentWeight();
        return this.currentWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty())
            return null;
        Item heaviest = items.get(0);
        for (Item item :
                items) {
            if (heaviest.getWeight() < item.getWeight())
                heaviest = item;
        }
        return heaviest;
    }

    public String toString() {
        calculateCurrentWeight();
        int size = items.size();
        if (size > 1)
            return size + " items (" + this.currentWeight + "kg)";
        else if (size == 1)
            return size + "item (" + this.currentWeight + "kg)";
        else
            return "no items (" + this.currentWeight + " kg)";
    }
}
