import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        int lastPos = this.stack.size()-1;
        String lastItem = this.stack.get(lastPos);
        this.stack.remove(lastPos);
        return lastItem;
    }
}
