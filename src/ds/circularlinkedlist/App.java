package ds.circularlinkedlist;

/**
 * Created by Peter on 2016/11/2 0002.
 */
public class App {
    public static void main(String[] args) {
        CircularLinkedList mylist = new CircularLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.insertLast(6666);

        mylist.diplayList();
    }
}
