package sortalgorithms;

import java.util.Arrays;


public class MergeSort {

  // Merge two subarrays L and M into arr
  public static int merge(int arr[], int p, int q, int r) {
    
    int counter = 0;

    // Create L ← A[p..q] and M ← A[q+1..r]
    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++){
        counter++;
        L[i] = arr[p + i];
    }
      
    
    for (int j = 0; j < n2; j++){
        counter++;
        M[j] = arr[q + 1 + j];
    }

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) {
        counter++;
        
        counter++;
        if (L[i] <= M[j]) {
          arr[k] = L[i];
          i++;
        } else {
          arr[k] = M[j];
          j++;
        }
        k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
        counter++;
        
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        counter++;
        
        arr[k] = M[j];
        j++;
        k++;
    }
    
    //System.out.println("Array depois de ser ordenado com Merge Sort: \n" + Arrays.toString(arr));
    return counter;
  }

  // Divide the array into two subarrays, sort them and merge them
    public static int mergeSort(int arr[], int l, int r) {
        int counter = 0;
        counter++;
        if (l < r) {

          // m is the point where the array is divided into two subarrays
          int m = (l + r) / 2;

          counter =+ mergeSort(arr, l, m);
          counter =+ mergeSort(arr, m + 1, r);

          // Merge the sorted subarrays
          counter+= merge(arr, l, m, r);
        }
        
        return counter;
  }

}