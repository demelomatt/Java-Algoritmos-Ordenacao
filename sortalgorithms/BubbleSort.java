
package sortalgorithms;


import java.util.Arrays;

/**
 *
 * @author matt
 */
public class BubbleSort {
    
    public static int bubbleSort(int array[]) {
    int size = array.length; // tamanho do array
    int counter = 0; // contador para comparações
    
    // Para cada elemento
    for (int i = 0; i < (size-1); i++) {
        counter++;
    
      // Checar se já trocou
        boolean swapped = false;
      
      // Comparar com elemetos adjacentes
        for (int j = 0; j < (size-i-1); j++) {
            counter++;
            
            counter++;
            // trocar elementos se maior
            if (array[j] > array[j + 1]) {

              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;

              swapped = true;
            }
          }

      // parar se já foi trocado
        if (!swapped)
            break;

    }
    
    //System.out.println("Array depois de ser ordenado com Bubble Sort: \n" + Arrays.toString(array));
    
    return counter;
  }
}
