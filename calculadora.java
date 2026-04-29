import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("digite o primeiro número");
        int num1 = Sc.nextInt();
        System.out.println("digite o segundo número");
        int num2 = Sc.nextInt();
        System.out.println("qual operação você vai usar?");
        System.out.println("1)+" +
                " 2)-" +
                " 3)/" +
                " 4)*" +
                " 5)√" +
                " 6)>" +
                " 7)< ");

        int calcu = Sc.nextInt();
        switch (calcu) {
            case 1:
                System.out.println("a soma de " + num1 + " + " + num2 + " é " + (num1 + num2));
                break;
            case 2:
                System.out.println("a subtração de " + num1 + " - " + num2 + " é " + (num1 - num2));
                break;
            case 3:
                System.out.println("a divisão de " + num1 + " / " + num2 + " é " + (num1 / num2));
                break;
            case 4:
                System.out.println("a multiplicação de " + num1 + " * " + num2 + " é " + (num1 * num2));
                break;
            case 5:
                System.out.println("a raiz do " + num1 + " e do " + num2 + " é " + Math.sqrt(num1) + " e " + Math.sqrt(num2));
                break;
            case 6:
                if (num1 > num2) {
                    System.out.println(num1 + " > " + num2);
                } else {
                    System.out.println("o segundo número é maior");
                }
                break;
            case 7:
                if (num2 > num1) {
                    System.out.println(num2 + " > " + num1);
                } else {
                    System.out.println("o primeiro número é maior");
                }
                break;
            default:
                System.out.println("a operação não foi encontrada, tente novamente");
            Sc.close();
        }
    }
}
//um dia eu faço uma calculadora boa, uma que nao apenas compare dois valores