
package sortalgorithms;

import java.util.Arrays;

public class QuickSort {

  // method to find the partition position
  public static int[] partition(int array[], int low, int high) {
    int counter = 0;
    // choose the rightmost element as pivot
    int pivot = array[high];
    
    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
        counter++;
        
        counter++;
      if (array[j] <= pivot) {

        // if element smaller than pivot is found
        // swap it with the greatr element pointed by i
        i++;

        // swapping element at i with element at j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swapt the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    
    int[] returnArray = {(i + 1), counter};
    // return the position from where partition is done
    return returnArray;
  }

  public static int quickSort(int array[], int low, int high) {
      int counter = 0;
      
      counter++;
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int[] returnArray = partition(array, low, high);
      int pi = returnArray[0];
      
      counter =+ returnArray[1];
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
    }
    
    //System.out.println("Array depois de ser ordenado com Quick Sort: \n" + Arrays.toString(array));
    return counter;
  }
}