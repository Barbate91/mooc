import java.util.HashMap;
import java.util.Objects;

public class IOU {
    private HashMap<String,Double> ious = new HashMap<>();

    public void setSum(String toWhom, double amount) {
        ious.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (ious.get(toWhom) == null)
            return 0;
        else
            return ious.get(toWhom);
    }
}
