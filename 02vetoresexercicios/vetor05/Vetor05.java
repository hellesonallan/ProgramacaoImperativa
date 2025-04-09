import java.util.Scanner;

public class Vetor05 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANHO = 10;
        int[] numeros = new int[TAMANHO];
        int pares = 0;
        
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < TAMANHO; i++) {
            if ((numeros[i] % 2) == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
    }
}