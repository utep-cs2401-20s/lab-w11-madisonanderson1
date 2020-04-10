import java.rmi.dgc.VMID;

public class newSorting {

    public void newSort(int[] array, int size) {
        //base case
        if (array.length <= size) {
            quickSort(array, 0,array.length-1);
        } else {
            int mid = array.length / 2; //find mid-point of array
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];
            //populate arrays
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = 0; i < array.length - mid; i++) {
                right[i] = array[mid + i];
            }
            //use new sort on both new arrays from original array
            newSort(left, size);
            newSort(right, size);
            //merge the array in order
            mergeSortedHalves(array, left, right);

        }
    }

    public void quickSort(int[] array, int start, int last) {
        if (start < last) {
            int part = partition(array, start, last);
            quickSort(array, start, part - 1);
            quickSort(array, part + 1, last);
        }
    }
    public int partition(int[] array, int start, int last) {
        //GOAL have an array = {(#s less than)(pivot)(#s greater than)}
        int pivot = array[start];
        int more = last;
        int less = start;
        while (less < more) {
            //go through the left side until reaches a number greater than the pivot
            while (less <= last && array[less] <= pivot) {
                less++;
            }
            //go through the right side until reaches a number less than the pivot
            while (more >= start && array[more] > pivot) {
                more--;
            }
            if (less < more && less<=last) {
                int temp = array[start];
                array[start] = array[more];
                array[more] = temp;
            }
        }
        int temp = array[start];
        array[start] = array[more];
        array[more] = temp;
        return start+1;
    }

    public void mergeSortedHalves(int[] a, int[] left, int[] right){
        int l = a.length / 2;
        int r = a.length - l;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<l && j < r){
            //move values in correct order
            if (left[i] <= right[j]){
                a[k++] = left[i++];
            } else{
                a[k++] = right[j++];
            }
        }
        //add remaining elements
        while(i < l){
            a[k++] = left[i++];
        }
        while (j < r){
            a[k++] = right[j++];
        }
    }

}
