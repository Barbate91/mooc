import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory = new ArrayList<>();

    public double maxValue() {
        if (this.changeHistory.isEmpty())
            return 0;
        double largest = this.changeHistory.get(0);
        for (Double change :
                this.changeHistory) {
            if (change > largest)
                largest = change;
        }
        return largest;
    }

    public double minValue() {
        if (this.changeHistory.isEmpty())
            return 0;
        double smallest = this.changeHistory.get(0);
        for (Double change :
                this.changeHistory) {
            if (change < smallest)
                smallest = change;
        }
        return smallest;
    }

    public double average() {
        if (this.changeHistory.isEmpty())
            return 0;
        double count = 0;
        double total = 0;
        for (Double change:
             this.changeHistory) {
            total += change;
            count++;
        }
        return total/count;
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public String toString() {
        return this.changeHistory.toString();
    }
}
