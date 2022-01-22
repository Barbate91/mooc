import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipe = new ArrayList<>();

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        if (this.pipe.isEmpty())
            return null;
        T oldest = pipe.get(0);
        pipe.remove(0);
        return oldest;
    }

    public boolean isInPipe() {
        if (this.pipe.isEmpty())
            return false;
        else
            return true;
    }
}
