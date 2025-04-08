import java.util.Random;

public class PreencherVetor {
    public static Random gerador = new Random();

    public static void vetorRepeticao() {
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

        System.out.println();
        System.out.println("Preenchendo vetores com repetição: ");
        System.out.println();

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
    
    public static void vetorEmbaralhado() {
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
        
        System.out.println();
        System.out.println();
        System.out.println("Preenchendo vetores embaralhando: ");
        System.out.println();

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        vetorRepeticao();
        vetorEmbaralhado();
    }
}