public class newSorting {

    public void newSort(int[] array, int size){
        //base case
        if(array.length <= size){
            //quicksort
        }  else {
            int mid = array.length/2; //find mid-point of array
            int[] left = new int[mid];
            int[] right = new int[array.length-mid];
            //populate arrays
            for (int i = 0; i < mid; i++){
                left[i] = array[i];
            }
            for(int i = 0; i < array.length-mid; i++){
                right[i] = array[mid+i];
            }
            newSort(left, size);
            newSort(right, size);
            //merge halves

        }
    }


}
