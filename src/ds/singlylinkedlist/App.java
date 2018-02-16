package ds.singlylinkedlist;

/**
 * Created by Peter on 2016/11/2 0002.
 */
public class App {
    public static void main(String[] args) {
        SinglyLinkedList mylist = new SinglyLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.insertLast(6666);

        mylist.diplayList();
    }
}
