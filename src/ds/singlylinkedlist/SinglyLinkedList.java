package ds.singlylinkedlist;

/**
 * Created by Peter on 2016/11/2 0002.
 */
public class SinglyLinkedList {
    private Node first;
//    private Node last; //for efficiency only when we implement insertLast method here, this is not a circularList here.

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    //use to insert at the beginning of the list
    public void insertFirst(int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;//old first????
//        if (isEmpty()) {
//            last = newNode;
//        }
        first = newNode;

    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return  temp;
    }

    public void diplayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data) {
//        Node current = last; --> for efficiency here.
//        if (isEmpty()) {
//            current = first;
//        }
        Node current = first;
        while (current.next != null) {
            current = current.next; //loop till current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;

    }
}
