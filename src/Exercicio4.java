import java.util.Scanner;

public class Exercicio4 {

    static final int n = 3;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[n][n];
        int i, j;
        int[] maiorElem = new int[n];

        for(i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Digite 9 valores: ");
                matriz [i][j] = ler.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (matriz[i][j] > maiorElem[i]) {
                    maiorElem[i] = matriz[i][j];
                }
            }
            System.out.printf("Maior elemento da %dº linha: %d\n", i + 1, maiorElem[i]);
        }
    }
}

