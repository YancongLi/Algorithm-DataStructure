package ds.adt.stack;

/**
 * Created by Peter on 2016/10/11 0011.
 */
public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
//
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);

        String string = "hello";
        System.out.println(string);
        System.out.println(reverseString(string));

        while (!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }

        theStack.pop();
    }

    public static String reverseString(String string){
        Stack stringStack = new Stack(string.length());
//        while (!stringStack.isFull()){
            for (char i: string.toCharArray()){
                stringStack.push(i);
            }
//        }

        String reversed ="";
        while (!stringStack.isEmpty()){
            reversed += stringStack.pop();
        }

        return reversed;
    }
}
