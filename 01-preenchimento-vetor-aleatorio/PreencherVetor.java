import java.util.Random;

public class PreencherVetor {
    public static Random gerador = new Random();

    public static int[] criarVetor() {
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = gerador.nextInt(10) + 1;
            vetor[i] = numeroAleatorio;
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