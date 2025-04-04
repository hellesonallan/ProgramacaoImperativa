import java.util.Random;

public class PreencherVetor {
    public static Random gerador = new Random();

    public static int[] criarVetor() {
        int[] vetor = new int[1000];
        int i = 0;

        while (i < 1000) {
            int numAleatorio = gerador.nextInt(1000) + 1;
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (vetor[j] == numAleatorio) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                vetor[i] = numAleatorio;
                i++;
            }
        }

        return vetor;
    }

    public static void ordenarVetor(int[] vetor) {
        int tamanhoVetor = vetor.length;
        for (int i = 0; i < tamanhoVetor - 1; i++) {
            for (int j = 0; j < tamanhoVetor - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = criarVetor();
        ordenarVetor(vetor); // função para ordenar o vetor em ordem crescente

        for (int num : vetor) {
            System.out.println(num);
        }
    }
}