package algorithms;

public class MergeSort {
    public static void main(String[] args) {

        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
        MergeSort sorter = new MergeSort();

        sorter.sort(inputArray);

        for (int i: inputArray
             ) {
            System.out.println(i);
        }

    }

    public static void sort(int[] array) {
        sort(array, 0, array.length-1);

    }

    private static void sort(int[] array, int start, int end) {
        if (start >= end) {
            return; // stop, done traversing the array
        }

        int mid = (start+end)/2;
        sort(array, start, mid);        //sort the left half
        sort(array, mid+1, end);   //sort the right half
        merge(array, start, mid, end); //merge sorted results into the input array

    }

    private static void merge(int[] array, int start, int mid, int end) {
        int tempArray[] = new int[end-start+1];

        //index counter for the left side of the array
        int leftSlot = start;
        //index counter for the right side of the array
        int rightSlot = mid+1;
        int k=0;

        while (leftSlot <= mid && rightSlot <= end){
            if (array[leftSlot] < array[rightSlot]) {
                tempArray[k] = array[leftSlot];
                leftSlot++;
            } else {
                tempArray[k] = array[rightSlot];
                rightSlot++;
            }
            k++;
        }
        //when it gets to here, the above loop has completed.
        //so both the left side and the right side of the sub-array can be considered sorted

        if (leftSlot<=mid) {//consider the right side being sorted. Left must be sorted already
            while (leftSlot <= mid){
                tempArray[k] = array[leftSlot];
                leftSlot++;
                k++;
            }
        }else if (rightSlot <= end) {
            while ( rightSlot <= end) {
                tempArray[k] = array[rightSlot];
                rightSlot++;
                k++;
            }
        }

        //copy over the temp array to the slots of the inputArray
        for (int i = 0; i < tempArray.length; i++) {
            array[start+i] = tempArray[i];
        }

    }
}
