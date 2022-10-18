import java.util.Scanner;

public class Exercicio1b {

    public static void main(String[] args) {
        int i;
        int n;
        float media = 0;
        float total;

        Scanner ler = new Scanner(System.in);

        System.out.print("Introduza o numero de valores a serem inseridos no vetor: ");
        n = Integer.parseInt(ler.nextLine());

        int[] vetor = new int [n];

        for (i = 0; i < n; i++) {
            System.out.print("Introduza os " + n + " numeros inteiros: ");
             vetor[i] = ler.nextInt();
        }

        for( i = 0; i < vetor.length; i++)
            media += vetor[i];

        total = media / vetor.length;

        System.out.println("A média dos valores: " + total);
    }
}
