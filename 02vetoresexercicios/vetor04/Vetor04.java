import java.util.Scanner;

public class Vetor04 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANHO = 8;
        double[] numeros = new double[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextDouble();
        }

        System.out.println();
        System.out.print("Digite a posição X (1-8): ");
        int x = input.nextInt();
        System.out.print("Digite a posição Y (1-8): ");
        int y = input.nextInt();

        double soma = numeros[x - 1] + numeros[y - 1];
        System.out.println();
        System.out.println("Soma das posições: " + soma);
    }
}