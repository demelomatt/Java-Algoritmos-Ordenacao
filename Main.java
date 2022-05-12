
import sortalgorithms.*;
import java.util.Arrays;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrSizes = {5,10,50,100,1000,10000};
        int nElements = 50;
        String[] algorithms = {"Bubble sort", "Selection Sort", "Insertion Sort" ,"Heap Sort", "Merge Sort", "Quick sort", "Count sort", "Bucket Sort", "Radix Sort"};
        int[] sum = new int[algorithms.length]; // Armazenar soma de comparações
        float[] avg = new float[algorithms.length]; // Armazenar médias
        
        // Para cada tamanho de vetor
        for (int size : arrSizes){
              
            // Gerar 50 vetores
            for (int j = 1; j <= nElements; j++){
                int[] randArray = RandomArray.randomArray(size);
                //System.out.println("\nArray " + j + " de " + size +  " elementos \n");
                //System.out.println("Array antes de ser ordenado \n" + Arrays.toString(randArray) + "\n");
                   
                // soma de comparações de cada algoritmo
                sum[0]+= BubbleSort.bubbleSort(randArray);
                sum[1]+= SelectionSort.selectionSort(randArray);
                sum[2]+= InsertionSort.insertionSort(randArray);
                sum[3]+= HeapSort.heapSort(randArray);
                sum[4]+= MergeSort.mergeSort(randArray, 0, randArray.length - 1);
                sum[5]+= QuickSort.quickSort(randArray, 0, randArray.length - 1);
                sum[6]+= CountSort.countSort(randArray, randArray.length);

            }
            
            System.out.println();
            // Fazer a média de cada algoritmo
            for (int a = 0; a < algorithms.length; a++){
                avg[a] = sum[a]/nElements;
                System.out.println("A média de comparações entre 50 vetores de tamanho " + size + " utilizando o algoritmo " + algorithms[a] +" é: " + avg[a]);
            }
        }
    }
    
    
}
