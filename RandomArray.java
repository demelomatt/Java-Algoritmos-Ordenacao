import java.util.Random; // Números aleatórios

 public class RandomArray {
    // Gerar array aleatório
    public static int[] randomArray(int arrSize){

    Random rand = new Random();
    int limit = 5000;
    int[] array = new int[arrSize]; // novo array

    // Gerar número aleatório entre 0 e 5000 e atribuir ao elemento i do array
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(limit);
      }
    return array;
  }
}
