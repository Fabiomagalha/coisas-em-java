import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas idades você quer calcular?");
        int i = sc.nextInt();
        int med = i;
        int idade_cal = 0;

        while (i-1 >= 0) {
            System.out.println("digite a idade");
            int idade = sc.nextInt();
            i = i - 1;
            idade_cal = idade + idade_cal;

        }
        int media = idade_cal/med;
        System.out.println(media);
    }
}
