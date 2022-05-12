
package sortalgorithms;

import java.util.Arrays;

public class InsertionSort {

  public static int insertionSort(int array[]) {
    int size = array.length;
    int counter = 0;

    for (int step = 1; step < size; step++) {
        counter++;
        int key = array[step];
        int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      
        while (j >= 0 && key < array[j]) {
            counter++;
            
            array[j + 1] = array[j];
            --j;
        }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;
    }
    
    //System.out.println("Array depois de ser ordenado com Selection Sort: \n" + Arrays.toString(array));
    return counter;
  }
}