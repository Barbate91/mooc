public class Counter {
    private int value;

    public Counter(int startValue) {
        value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0)
            value += increaseBy;
    }

    public void increase() {
        increase(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0)
            value -= decreaseBy;
    }

    public void decrease() {
        decrease(1);
    }
}
