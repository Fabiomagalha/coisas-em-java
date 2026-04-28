import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Admin";
        String nomeDB = null;
        String senha = "123456";
        String senhaDB = null;

        System.out.println("digite seu login");
        nomeDB = sc.nextLine();

        System.out.println("digite a sua senha");
        senhaDB = sc.nextLine();

        if ((nomeDB.equals(nome)) && senhaDB.equals(senha)){
            System.out.println("acesso liberado");
        } else if ((nomeDB.equals(nome) && !senhaDB.equals(senha))){
            System.out.println("acesso negado, errou a senha");
        } else if ((!nomeDB.equals(nome)) && senhaDB.equals(senha)) {
            System.out.println("acesso negado, errou o login");
        } else {
            System.out.println("acesso negado, errou a senha e o login");
        }
        sc.close();
    }
}
