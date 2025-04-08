import java.util.Random;

public class TabelaFrequencia {
    public static Random gerador = new Random();
    
    public static void main(String[] args) {
        int tamanho = 200;
        int[] numeros = new int[tamanho];
        int[] frequencia = new int[tamanho + 1];

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = gerador.nextInt(tamanho) + 1;
        }

        for (int i = 0; i < tamanho; i++) {
            int numero = numeros[i];
            frequencia[numero]++;
        }

        System.out.println("Número | Frequência");
        System.out.println("-------------------");
        for (int i = 1; i <= tamanho; i++) {
            if (frequencia[i] > 0) {
                System.out.println(i + "      | " + frequencia[i]);
            }
        }
    }
}