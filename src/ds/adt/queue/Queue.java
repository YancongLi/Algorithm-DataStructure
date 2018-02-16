package ds.adt.queue;

/**
 * Created by Peter on 2016/10/19 0019.
 */
public class Queue {

    private int maxSize; //initialize the set number of slots
    private long[] queArray; //slots to maintain the data
    private int front; //this will be the index position of the element in the front
    private int rear; //this is also going to be the index position for the element at the back of the line
    private int nItems; //count to maintain the number of items in our queue

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems =0;
    }

    public void insert(long j) {

        //Circular queue:
        if (rear == maxSize -1) {
            rear = -1;
        }
        //=========================

        rear++;
        queArray[rear] = j;
        nItems ++;
    }

    public long remove() {//remove item from the front of the queue
        long temp = queArray[front];
        front++;
        if (front == maxSize) { //should be (front + 1 == maxSize) ???
            front = 0;// we can set front back to 0th index so that we can utilize the entire array again
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return  (nItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for (long i: queArray) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
