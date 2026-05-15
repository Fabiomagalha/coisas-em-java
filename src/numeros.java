import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("escreva o segundo numero");
        int num2 = sc.nextInt();
        int subt = 0;

        if (num1 > num2) {
            subt = num1 - num2;
        } else if (num2 > num1) {
            subt = num2 - num1;
        } else {
            System.out.println("ambos os números sao iguais");
        }
        System.out.println(subt);
    }
}
