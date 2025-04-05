public class Vetor01 {
    public static void main(String[] args) {
        int[] a = {1, 0, 5, -2, -5, 7};
        int soma = a[0] + a[1] + a[5];
        System.out.println("Soma: " + soma);
        a[3] = 100;
        for (int num : a) {
            System.out.println(num);
        }
    }
}
