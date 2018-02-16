package ds.adt;

/**
 * Created by Peter on 2016/10/8 0008.
 */
public class Counter {
    private String counterName;
    private int value;

    public Counter(String name) {
        this.counterName = name;
        this.value = 0;
    }

    public void increment() {
        this.value++;
    }

    public int getCurrentValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counterName='" + counterName + '\'' +
                ", value=" + value +
                '}';
    }
}
