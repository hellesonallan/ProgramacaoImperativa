import java.util.Scanner;

public class Vetor02 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Números Inseridos");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println();
    }
}