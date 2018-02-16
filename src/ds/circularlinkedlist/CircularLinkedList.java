package ds.circularlinkedlist;

/**
 * Created by Peter on 2016/11/2 0002.
 */
public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first; // newNode --> old first
        first = newNode;
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        }else {
            last.next = newNode; //the next value of the last node will point to the new node
            last = newNode; //we make the new node we created be the last one in the list
        }
    }

    public int deleteFirst() {
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
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
}