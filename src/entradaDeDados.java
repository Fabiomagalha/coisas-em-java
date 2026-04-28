import java.util.Scanner;


public class entradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("escreva o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("escreva o segundo número");
        int num2 = sc.nextInt();


        int soma = num1 + num2;
        System.out.println("a soma é " + soma);
        System.out.println("a multiplicação do " + num1 + " por 2 é " + (num1*2));


        sc.close();
    }
}
