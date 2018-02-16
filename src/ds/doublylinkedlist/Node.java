package ds.doublylinkedlist;

/**
 * Created by Peter on 2016/11/3 0003.
 */
public class Node {
    public int data;
    public Node next;
    public Node previous;

    public void displayNode() {
        System.out.println("{ " + data +" }");
    }
}