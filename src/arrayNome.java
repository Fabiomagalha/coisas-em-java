import java.util.Scanner;

public class arrayNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("digite a quantidade de cadastro");
        int qtd = sc.nextInt();
        sc.nextLine();
        String nomes[] = new String[qtd];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("digite o "+(1+i)+ "° nome");
            nomes[i] = sc.nextLine();
        }
        System.out.println("lista de nomes");
        for (int i=0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        sc.close();
    }
}

