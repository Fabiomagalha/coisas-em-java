import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 1234) {
            System.out.println("escreva a sua senha (obs: ela tem 4 digitos)");
            senha = sc.nextInt();
        }
        System.out.println("sua senha está correta");
    }
}12