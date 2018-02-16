package algorithms;

/**
 * Created by peter on 2017-06-19.
 */
public class Recursion {

    public static void main(String[] args) {
        reduceByOne(10);
        int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(recursiveLinearSearch(intArray, 0, 19));
//        System.out.println(recursiveBinarySearch(intArray, 0, intArray.length-1, 9));
    }

    public static void reduceByOne(int n) {
        if (n >= 0) {//base case
            reduceByOne(n - 1);
        }

        System.out.println("Completed Call: "+ n);//this line will run one more time when n hits -1, because it's invoked when reduceByOne(0 - 1)
    }

    /*
    * output:
    * Completed Call: -1
      Completed Call: 0
      Completed Call: 1
      Completed Call: 2
      Completed Call: 3
      Completed Call: 4
      Completed Call: 5
      Completed Call: 6
      Completed Call: 7
      Completed Call: 8
      Completed Call: 9
      Completed Call: 10
      */

    public static int recursiveLinearSearch(int[] A,int i ,int x) {//A is an Int array and i is index(should be set to zero when calling), x is the target element
        if(i > A.length-1) {
            return -1;
        }
        else if (A[i] == x) {
            return i;
        }
        else{
            System.out.println("Position at: "+ i);
            return recursiveLinearSearch(A, i+1, x);}
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
        int middleIndex = (p+r)/2;
        if (p>r) {return -1;}
        if (x==a[middleIndex]){
            return middleIndex;
        }
        if(x<a[middleIndex]) {
            System.out.println("middleIndex Position at: "+middleIndex);
            return recursiveBinarySearch(a, p, middleIndex, x);
        }
        else {
            System.out.println("middleIndex Position at: "+middleIndex);
            return recursiveBinarySearch(a, middleIndex+1, r, x);
        }
    }
}
