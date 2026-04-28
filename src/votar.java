import java.util.Scanner;

public class votar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = sc.nextInt();

        if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("voto opcional");
        }  else if (idade <= 15) {
            System.out.println("voce não pode votar");
        } else {
            System.out.println("voto obrigatorio");
        }
        sc.close();
    }
}
