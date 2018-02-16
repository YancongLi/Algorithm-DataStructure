package ds.adt.stack;

/**
 * Created by Peter on 2016/10/11 0011.
 */
public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[this.maxSize];
        this.top = -1;
    }

    public void push(char j) {
        if (!isFull()) {
            top++;
            stackArray[top] = j;
        }else {
            System.out.println("the Stack is already full, further insertion is not allowed");
        }
    }

    public char pop() {
        int previous_top = -1;
        if (!isEmpty()) {
            previous_top = top;
            top--;
            return stackArray[previous_top];
        } else {
            System.out.println("the Stack is empty now, no element can be popped (return: -1)");
        }
        return '_';
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

}
