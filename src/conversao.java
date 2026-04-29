import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String disciplina = "java";

        System.out.println("você quer converter sua escrita para maiuscula (1) ou minuscula (2)?");
        int resp = sc.nextInt();
        if (resp == 1) {
            System.out.println("Digite a sua palavra pra converter");
            String palavra = sc.nextLine();
            palavra = sc.nextLine().toUpperCase();
            System.out.println(palavra);
        } else {
            System.out.println("digite sua palavra para converter");
            String palavra = sc.nextLine();
            palavra = sc.nextLine().toLowerCase();
            System.out.println(palavra);
        }

        //eu posso usar isso para comparar senhas, nesse caso eu declararia uma variavel certa para a senha e depois compararia elas com um System.out.println(palavra.equals(palavra2));

        sc.close();
    }
}
