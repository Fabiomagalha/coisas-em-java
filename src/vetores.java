import java.util.Scanner;

public class vetores {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual a quantidade de vezes que você quer que conferir o valor de b?");
        int qtd = sc.nextInt();

        int[] a = new int[qtd];
        int[] b = new int[qtd];


        for (int i = 0; i < qtd; i++){
            System.out.println("qual o valor do " + (i+1) + "° do vetor");
            a[i] = sc.nextInt();
            b[i] = a[i]%2;
        }

        for (int i = 0; i < qtd; i++) {
            System.out.println("o resto da divisão de " + a[i] + " por 2 é = " + b[i]);
        }

        sc.close();

    }
}
