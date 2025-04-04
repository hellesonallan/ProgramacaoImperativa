import java.util.Random;

public class PreencherVetor {
    public static Random gerador = new Random(); // Instância do gerador de números aleatórios

    public static void criarVetor1() {
        int[] vetor = new int[1000]; // Vetor para armazenar 1000 números
        int numerosInseridos = 0; // Contador de números já inseridos

        while (numerosInseridos < vetor.length) { // Loop até preencher todo o vetor
            int numeroAleatorio = gerador.nextInt(vetor.length) + 1; // Gera número entre 1-1000
            boolean repetido = false; // Flag para verificar repetição

            for (int i = 0; i < numerosInseridos; i++) { // Verifica se número já existe
                if (vetor[i] == numeroAleatorio) {
                    repetido = true;
                    break; // Encerra verificação se encontrar repetido
                }
            }

            if (!repetido) { // Se não for repetido, adiciona ao vetor
                vetor[numerosInseridos] = numeroAleatorio;
                numerosInseridos++; // Incrementa contador
            }
        }

        for (int num : vetor) { // Imprime todos os números do vetor
            System.out.print(num + " ");
        }
    }
    
    public static void criarVetor2() {
        int[] vetor = new int[1000]; // Vetor para armazenar 1000 números

        for (int i = 0; i < vetor.length; i++) { // Preenche com números ordenados 1-1000
            vetor[i] = i + 1;
        }

        for (int i = 0; i < vetor.length; i++) { // Embaralha o vetor (Fisher-Yates)
            int indiceAleatorio = gerador.nextInt(vetor.length); // Índice aleatório para troca

            int temp = vetor[i]; // Troca elementos de posição
            vetor[i] = vetor[indiceAleatorio];
            vetor[indiceAleatorio] = temp;
        }

        for (int num : vetor) { // Imprime todos os números do vetor
            System.out.print(num + "   ");
        }
    }

    public static void main(String[] args) { // Ponto de entrada do programa
        criarVetor1(); // Executa o primeiro método de preenchimento
    }
}