package ds.doublylinkedlist;

/**
 * Created by Peter on 2016/11/3 0003.
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last  = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last  = newNode; //if empty, last will refer to newNode being created
        } else {
            first.previous = newNode;
        }

        newNode.next = first;// the new mode's next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;// assigning old last to newNode
            newNode.previous = last;// the old last will be the newNode's previous
        }

        this.last =newNode;// the linkedList's last field should point to the new node
    }

    //assume non-empty list:
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {// there is only one item in the list
            last = null;
        } else {
            first.next.previous = null; //the list's first node will point to null
        }

        first = first.next;
        return temp;// return the deleted old first node

    }

    //assume non-empty list
    public Node deleteLast() {
        Node temp = last;
        if (last.previous == null) {
            first = null;
            last = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
        return temp;
    }

    //assume non-empty list
    public boolean insertAfter(int key, int data) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data =data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }

        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    //assume non-empty list
    public Node deleteKey(int key) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                //System.out.println("key not found in the list, return null");
                return null;
            }
        }

        if (current == first) {
            first = current.next;
            current.next.previous = null;
        }

        if (current == last) {
            last = current.previous;
            current.previous.next = null;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;

        return current;
    }

    public void displayForward() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List (last --> first) ");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }


}
