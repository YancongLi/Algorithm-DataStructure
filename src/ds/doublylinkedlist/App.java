package ds.doublylinkedlist;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Peter on 2016/11/6 0006.
 */
public class App {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward();
        theList.displayBackward();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);
        theList.displayForward();
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.displayForward();

        Rectangle.Double r1 = new Rectangle.Double(100, 100, 100.1, 100.1);
        Line2D.Double l1 = new Line2D.Double(0, 200.1, 200.1, 0);
        System.out.println("l1.intsects(r1) = " + l1.intersects(r1));
    }
}
