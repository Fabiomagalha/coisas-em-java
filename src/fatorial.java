import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("digite um numero");
        int num = sc.nextInt();
        int fatorial = 1;
        for (int i = 2 ; i <= num ; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
