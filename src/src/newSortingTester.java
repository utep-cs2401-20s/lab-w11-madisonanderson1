import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class newSortingTester extends newSorting{

    @Test
    public void testNewSorting1(){//first test case, I just want to see if quick sort works and works correctly
        //this is just to make sure it is working and get an idea if anything needs to be fixed
        int[] test = {3,2,1};
        int[] expected = {1,2,3};
        newSorting ns = new newSorting();
        ns.newSort(test,3);
        assertArrayEquals(expected, test); // failed three times then finally passes, I used the debugger to find out exactly what was happening and fixed it,
        // I was having a problem when I was switching the pivot at the end it was going out of bounds
        //I only wanted to make sure that the quickSort method worked so I can work my way into the next part knowing the first part is correct for sure

    }

    @Test
    public void testNewSorting2(){// since I had problems with the previous test I want to test purely quick Sort again
        int[] test = {3,1,5,4};// before only one value was out of place this time I am doing 2 values out of place to see if it will sort not just one, but BOTH of them
        int[] expected = {1,3,4,5};
        newSorting ns = new newSorting();
        ns.newSort(test,4);
        assertArrayEquals(expected, test);
        //after a couple fixes this test passed, I ran into a problem where it seemed like quick sort was only running through the array
        // for one pass but I got it to work
    }

    @Test
    public void testNewSorting3(){//first test using both quick sort and splitting/merging this is just an inital test to make sure it works
        int[] test = {1,3,4,2}; // get an idea about where I must go from their and fix any problems
        int[] expected = {1,2,3,4};
        newSorting ns = new newSorting();
        ns.newSort(test,2); // want to start off with small array and small size to see if it will work
        assertArrayEquals(expected, test);
        //Luckily this test worked on first try
    }

    @Test
    public void testNewSorting4(){ // I wanted to text this sorting method with a larger array to see if the length would affect the results
        int[] test = {2,3,5,6,7,1,8,9};//larger array
        int[] expected = {1,2,3,5,6,7,8,9};
        newSorting ns = new newSorting();
        ns.newSort(test,2);
        assertArrayEquals(expected, test); //array passed on first try
    }

    @Test
    public void testNewSorting5(){// now I want to test the previous tested array but with a different size passed in the newSorting method to see if this will change anything
        int[] test = {2,3,5,6,7,1,8,9};// which it shouldn't affect the result just how the result has gotten there
        int[] expected = {1,2,3,5,6,7,8,9};
        newSorting ns = new newSorting();
        ns.newSort(test,4);
        assertArrayEquals(expected, test); //passed on the first try
    }

}
