import java.util.Scanner;

public class condicoes {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("escreva um número");
        int num1 = num.nextInt();
        String nome = null;
        if (num1 > 0) {
            System.out.println("seu número é positivo");
        } else if (num1 == 0) {
            System.out.println("seu número é nulo");
        } else  {
            System.out.println("seu número é negativo");
        }
    }
}
