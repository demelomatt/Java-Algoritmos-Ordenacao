
package sortalgorithms;


// Bucket sort in Java

import java.util.Arrays;
import java.util.LinkedList;
import static sortalgorithms.InsertionSort.insertionSort;

public class BucketSort {
    public static int bucketSort(int[] vetor, int maiorValor)
    {
        int counter = 0;
        int numBaldes = maiorValor/5;

        LinkedList[] B = new LinkedList[numBaldes];

        for (int i = 0; i < numBaldes; i++){
            counter++;
            B[i] = new LinkedList<Integer>();
        }

        //Coloca os valores no balde respectivo:
        for (int i = 0; i < vetor.length; i++) {
            counter++;
            int j = numBaldes-1;
            while (true){
                    if(j<0){
                             break;
                    }
                    if(vetor[i] >= (j*5)){
                             B[j].add(vetor[i]);
                             break;
                    }
                    j--;
            }
        }

        //Ordena e atualiza o vetor:
        int indice = 0;
        for (int i = 0; i < numBaldes; i++){
            counter++;
            
            int[] aux = new int[B[i].size()];

            //Coloca cada balde num vetor:
            for (int j = 0; j < aux.length; j++){
                counter++;
                aux[j] = (Integer)B[i].get(j);
            }

            insertionSort(aux); //algoritmo escolhido para ordenação.

            // Devolve os valores ao vetor de entrada:
            for (int j = 0; j < aux.length; j++, indice++){
                counter++;
                vetor[indice] = aux[j];
            }

        }
        return counter;
    }
}
