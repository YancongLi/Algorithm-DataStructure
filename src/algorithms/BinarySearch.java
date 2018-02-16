package algorithms;

/**
 * Created by Peter on 2017/2/4 0004.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(8,intArray));
        System.out.println("Found: "+recursiveBinarySearch(intArray, 0, intArray.length-1, 8));

    }

    public static int binarySearch(int key,int[] a){
        int firstIndex = 0;
        int lastIndex = a.length-1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex+lastIndex)/2;
            if (a[middleIndex] == key) {
                return middleIndex;
            }
            if (a[middleIndex] > key) {
                lastIndex = middleIndex-1;
            }else firstIndex = middleIndex+1;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
        System.out.println("Searching: "+"["+p+"..."+r+"]");
        int middleIndex = (p+r)/2;
        if (p>r) {return -1;}
        if (x==a[middleIndex]){
            return middleIndex;
        }
        if(x<a[middleIndex]) {
            System.out.println("middleIndex Position at: "+middleIndex);
            return recursiveBinarySearch(a, p, middleIndex-1, x);
        }
        else {
            System.out.println("middleIndex Position at: "+middleIndex);
            return recursiveBinarySearch(a, middleIndex+1, r, x);
        }
    }


}
