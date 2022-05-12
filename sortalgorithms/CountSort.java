package sortalgorithms;

import java.util.Arrays;

public class CountSort {
    public static int countSort(int array[], int size) {
      int counter = 0;
      int[] output = new int[size + 1];

      // Find the largest element of the array
      int max = array[0];
      for (int i = 1; i < size; i++) {
          counter++;
          
          counter++;
        if (array[i] > max)
          max = array[i];
      }
      int[] count = new int[max + 1];

      // Initialize count array with all zeros.
      for (int i = 0; i < max; ++i) {
        counter++;
        
        count[i] = 0;
      }

      // Store the count of each element
      for (int i = 0; i < size; i++) {
        counter++;
        
        count[array[i]]++;
      }

      // Store the cummulative count of each array
      for (int i = 1; i <= max; i++) {
        counter++;
          
        count[i] += count[i - 1];
      }

      // Find the index of each element of the original array in count array, and
      // place the elements in output array
      for (int i = size - 1; i >= 0; i--) {
        counter++;
        
        output[count[array[i]] - 1] = array[i];
        count[array[i]]--;
      }

      // Copy the sorted elements into original array
      for (int i = 0; i < size; i++) {
        counter++;
          
        array[i] = output[i];
      }
      
      //System.out.println("Array depois de ser ordenado com Count Sort: \n" + Arrays.toString(array));
      return counter;
    }
    
}