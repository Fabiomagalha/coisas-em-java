import java.util.Scanner;

public class soma5array {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas vezes você quer somar e subtrair o valor a e o valor b?");
        int qtd = sc.nextInt();

        int[] a = new int[qtd];
        int[] b = new int[qtd];


        for (int i = 0; i < qtd; i++) {
            System.out.println("numero para a posição: " + i +" do primeiro número");
            a[i] = sc.nextInt();
            System.out.println("número para a posição: " + i +" do segundo número");
            b[i] = sc.nextInt();

        }

        int soma = 0;

        for (int i = 0; i < qtd; i++) {
            int resultado = a[i] - b[qtd - 1 - i];

            System.out.println(a[i] + " - " + b[qtd - 1 - i] + " = " + resultado);

            soma += resultado;
        }
        System.out.println("a soma total dos resultados é: " + soma);

        sc.close();
        }
    }
