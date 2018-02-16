package ds.linkedlists;

/**
 * Created by Peter on 2016/11/1 0001.
 */
public class App {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeB.data = 7;

        Node nodeD = new Node();
        nodeB.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA)); //4
        System.out.println(listLength(nodeB)); //3
        System.out.println(listLength(nodeC)); //2
        System.out.println(listLength(nodeD)); //1
    }

    public static int listLength (Node aNode) {
        int length = 1;

        Node currentNode = aNode;

        while (currentNode.next != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}
