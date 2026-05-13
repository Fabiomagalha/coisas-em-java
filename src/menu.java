import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escolha uma opção:");
        System.out.println("1 - calcular a média das notas");
        System.out.println("2 - contar números pares e ímpares");
        System.out.println("3 - sair");
        int resp = sc.nextInt();

        switch (resp) {
            case 1:
                int media = 0;

                System.out.println("quantas notas você quer calcular a média?");
                int qtd = sc.nextInt();

                int[] notas = new int[qtd];
                int soma = 0;

                for (int i = 0; i < qtd; i++) {
                    System.out.println("digite a nota" + (i+1) + ":");
                    notas[i] = sc.nextInt();
                    soma = soma + notas[i];
                }
                media = soma/qtd;
                System.out.println("a média é: " + media);
                break;
            case 2:
                System.out.println("você deseja contar até que número?");
                int num = sc.nextInt();
                System.out.println("você deseja contar até ímpar (escreva 1) ou até par (escreva 2)?");
                int resp2 = sc.nextInt();
                if (resp2 == 1) {
                    System.out.println("aqui estão os números ímpares até " + num);

                    for (int i = 1; i <= num; i++) {
                        if (i%2 != 0) {
                            System.out.println(i);
                        }
                    }

                } else if (resp2 == 2) {
                    System.out.println("aqui estão os números pares até " + num);

                    for (int i = 1; i <= num; i++) {
                        if (i%2 == 0) {
                            System.out.println(i);
                        }
                    }

                } else {
                    System.out.println("você digitou errado, por favor, recomece");
                }
                break;
            case 3:
                System.out.println("você está saindo...");
                break;
        }
    }
}


