import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd = new ArrayList<>();

    @Override
    public void move(int dx, int dy) {
        for (Movable member :
                this.herd) {
            member.move(dx,dy);
        }
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public String toString() {
        String herdStr = "";
        for (Movable member :
                this.herd) {
            herdStr += member + "\n";
        }
        return herdStr;
    }
}
