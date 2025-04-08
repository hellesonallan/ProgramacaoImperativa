import java.util.Scanner;

public class Vetor03 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANHO = 10;

        double[] numeros = new double[TAMANHO];
        double[] numerosQuadrados = new double[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double numeroInserido = input.nextDouble();
            numeros[i] = numeroInserido;
            numerosQuadrados[i] = numeroInserido * numeroInserido;
        }
        
        System.out.println();
        System.out.print("Numeros Inseridos: ");

        for (double num : numeros) {
            System.out.print(num + "  ");
        }

        System.out.println();
        System.out.print("Quadrado dos Numeros Inseridos: ");

        for (double num : numerosQuadrados) {
            System.out.print(num + "  ");
        }
    }
}
