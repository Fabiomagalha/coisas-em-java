import java.util.Scanner;

public class locadora {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos clientes da videolocadora você deseja ver?");
        int qtd = sc.nextInt();
        sc.nextLine();

        String clientes[] = new String[qtd];
        int locacoes[] = new int[qtd];
        int locacoes_gratis[] = new int[qtd];

        for (int i = 0; i < qtd; i++){
            System.out.println("qual o nome do "+ (i+1) + " cliente?");
            clientes[i] = sc.nextLine();
            System.out.println("quantas locações esse cliente fez?");
            locacoes[i] = sc.nextInt();
            sc.nextLine();

            if (locacoes[i] >= 10) {
                System.out.println();
                locacoes_gratis[i] = locacoes[i]/10;
            }

        }

        for (int i = 0; i < qtd; i++){
            System.out.println("o cliente " + clientes[i] + " tem " + locacoes[i] + " locações e tem " + locacoes_gratis[i] + " locações gratis");
        }

        sc.close();
    }
}
