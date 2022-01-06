import java.util.ArrayList;

public class StatCollection {
    private ArrayList<Stat> statArray = new ArrayList<>();

    public void add(int value) {
        if (value >= 0 && value <= 100) {
            statArray.add(new Stat(value));
        }
    }

    public double getPassing() {
        return getValueWithThreshold(50);
    }

    public double getTotal() {
        return getValueWithThreshold(0);
    }

    private double getValueWithThreshold(int thresh) {
        double total = 0;
        double count = 0;
        for (Stat stat :
                this.statArray) {
            int value = stat.getValue();
            if (value >= thresh) {
                count++;
                total += (double) value;
            }
        }
        if (total == 0)
            return 0;
        return total/count;
    }

    public double getPassingPercent() {
        double count = 0;
        for (Stat stat :
                this.statArray) {
            int value = stat.getValue();
            if (value >= 50) {
                count++;
            }
        }
        if (count > 0)
            return 100 * (count/(double)this.statArray.size());
        return 0.0;
    }

    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            String output = i + ": ";
            for (Stat stat :
                    this.statArray) {
                if (stat.getGrade() == i) {
                    count++;
                }
            }
            for (int j = 0; j < count; j++) {
                output += "*";
            }
            System.out.println(output);
        }
    }
}
