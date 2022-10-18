import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int i;
        int n;
        int j;
        int aux;

        Scanner ler = new Scanner(System.in);

        System.out.print("Introduza o numero de valores a serem inseridos no vetor: ");
        n = Integer.parseInt(ler.nextLine());

        int[] vetor = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Introduza os " + n + " numeros inteiros: ");
            vetor[i] = ler.nextInt();
        }

        n = n - 1;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= (n-1); j++) {
                if (vetor[j] > vetor [j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        for (i = 0; i <= n; i++) {
            System.out.println("Elemento: " + (i + 1) + "->" + " Valor: " + vetor[i]);
        }

        System.out.println("O maior valor é: " + vetor[n]);
        System.out.println("O segundo maior elemento será: " + vetor[n-1]);

    }
}
