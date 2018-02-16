package ds.adt;

public class App {

    public static void main(String[] args) {
	// write your code here
        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());
    }
}
