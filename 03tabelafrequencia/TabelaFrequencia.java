import java.util.Random;

public class TabelaFrequencia {
    public static Random gerador = new Random();
    
    public static void main(String[] args) {
        final int tamanhoVetor = 200;
        final int tamanhoGerador = 20;
        int[] numeros = new int[tamanhoVetor];
        int[] frequencia = new int[tamanhoVetor + 1];

        for (int i = 0; i < tamanhoVetor; i++) {
            numeros[i] = gerador.nextInt(tamanhoGerador) + 1;
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            int numero = numeros[i];
            frequencia[numero]++;
        }

        System.out.println("Número | Frequência");
        System.out.println("-------------------");
        for (int i = 1; i <= tamanhoVetor; i++) {
            if (frequencia[i] > 0) {
                System.out.println(i + "      | " + frequencia[i]);
            }
        }
    }
}