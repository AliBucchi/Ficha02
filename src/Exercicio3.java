import java.util.*;

public class Exercicio3 {

    public static void main(String[] args) {
        int n;
        int i;

        Scanner ler = new Scanner(System.in);

        System.out.print("Introduza o numero de pessoas a serem listadas: ");
        n = Integer.parseInt(ler.nextLine());

        ArrayList Pessoas = new ArrayList();


        for (i =0; i < n; i++) {
            System.out.println("Digite o(s) nome(s): ");
            String nome = ler.nextLine();
            Pessoas.add(nome);

            Collections.sort(Pessoas);

            System.out.println(Pessoas);
        }
    }
}
