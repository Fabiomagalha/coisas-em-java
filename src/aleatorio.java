import java.util.Scanner;

public class aleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int palpite = (int)(Math.random()*10) + 1;
        int num = 0;
        while (palpite != num) {
            System.out.println("escolha um número de 1 a 10 ate o acerto");
            num = sc.nextInt();
            if (num == palpite) {
                System.out.println("voce acertou!!!");
            } else  {
                System.out.println("voce errou, tente novamente ");
            }
        }
        sc.close();
    }
}
