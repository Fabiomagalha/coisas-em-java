import java.util.Scanner;

public class comparaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Fabio";
        String nomeDB = null;

        System.out.println("digite seu login");
        nomeDB = sc.nextLine();

        if (nomeDB.equals(nome)){
            System.out.println("acesso liberado");
        } else {
            System.out.println("acesso negado");
        }

        sc.close();
    }
}