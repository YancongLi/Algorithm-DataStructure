package ds.adt.queue;

/**
 * Created by Peter on 2016/10/19 0019.
 */
public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);
        System.out.println(myQueue.peekFront());
        myQueue.view();
    }
}
