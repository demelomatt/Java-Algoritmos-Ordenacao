
package sortalgorithms;

import java.util.Arrays;

  public class HeapSort {
  
    public static int heapSort(int arr[]) {
      int n = arr.length;
      int counter = 0;
  
      // Build max heap
      for (int i = n / 2 - 1; i >= 0; i--) {
        counter++;
        
        counter+= heapify(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        counter++;
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        counter+= heapify(arr, i, 0);
      }
      
      //System.out.println("Array depois de ser ordenado com Heap Sort: \n" + Arrays.toString(arr));
      return counter;
    }
  
    static int heapify(int arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
      
      int counter = 0;
      
      counter++;
      if (l < n && arr[l] > arr[largest])
        largest = l;
      
      counter++;
      if (r < n && arr[r] > arr[largest])
        largest = r;
      
      counter++;
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapify(arr, n, largest);
      }
      
      return counter;
    }
  }
  

