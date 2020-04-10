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
            newSort(left, size);
            newSort(right, size);
            //merge halves

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
        int pivot = array[start];
        int more = last;
        int less = start;
        while (less < more) {
            while (less <= last && array[less] <= pivot) {
                less++;
            }
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

}
