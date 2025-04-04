import java.util.Random;

public class PreencherVetor {
    public static Random gerador = new Random();

    public static void criarVetor1() {
        int[] vetor = new int[1000];
        int numerosInseridos = 0;

        while (numerosInseridos < vetor.length) {
            int numeroAleatorio = gerador.nextInt(vetor.length) + 1;
            boolean repetido = false;

            for (int i = 0; i < numerosInseridos; i++) {
                if (vetor[i] == numeroAleatorio) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                vetor[numerosInseridos] = numeroAleatorio;
                numerosInseridos++;
            }
        }

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
    
    public static void criarVetor2() {
        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }

        for (int i = 0; i < vetor.length; i++) {
            int indiceAleatorio = gerador.nextInt(vetor.length);

            int temp = vetor[i];
            vetor[i] = vetor[indiceAleatorio];
            vetor[indiceAleatorio] = temp;
        }

        for (int num : vetor) {
            System.out.print(num + "   ");
        }
    }

    public static void main(String[] args) {
        criarVetor1();
    }
}