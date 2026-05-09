import java.util.Scanner;


public class arrayPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a quantidasde de números para validar?");
        int qtd = sc.nextInt();


        int[] vetor = new int[qtd];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("número para a posição: " + i);
            vetor[i] = sc.nextInt();
        }
        boolean palindromo = true;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }


        if (palindromo) {
            System.out.println("é palindromo");
        } else {
            System.out.println("não é palindromo");
        }
        sc.close();
    }
}

