
package sortalgorithms;

import java.util.Arrays;


public class SelectionSort {
  public static int selectionSort(int array[]) {
    int size = array.length;
    int counter = 0;

    for (int step = 0; step < size - 1; step++) {
        counter++;
        int min_idx = step;

        for (int i = step + 1; i < size; i++) {
            counter++;

          // To sort in descending order, change > to < in this line.
          // Select the minimum element in each loop.
          counter++;
          if (array[i] < array[min_idx]) {
            min_idx = i;
          }
        }

        // put min at the correct position
        int temp = array[step];
        array[step] = array[min_idx];
        array[min_idx] = temp;
    }
    
    //System.out.println("Array depois de ser ordenado com Selection Sort: \n" + Arrays.toString(array));
    return counter;
  }
}