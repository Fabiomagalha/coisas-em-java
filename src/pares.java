import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        System.out.println("veja os números pares lado a lado");
        while (i <30) {
            if (i % 2!=1) {
                System.out.println(i+ " ");
            }
            i = i + 1;
        }
    }
}
