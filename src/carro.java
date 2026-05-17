import java.util.Scanner;

public class carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o número de viagens que serão feitas?");
        int i = sc.nextInt();
        while (i-1 >= 0) {
            System.out.println("quantos litros tem o combustivel?");
            int litros = sc.nextInt();
            System.out.println("qual a distancia percorrida do carro? (em km, por favor)");
            int distancia = sc.nextInt();
            int media = distancia / litros;
            System.out.println("a consumo medio é de " + media + " litros");
            i = i - 1;
            if (i == 0) {
                System.out.println("voce deseja fazer um novo calculo?");
                sc.nextLine();
                String rest = sc.nextLine();
                if (rest.equals("sim")) {
                    System.out.println("quantos números de viagem?");
                    i = sc.nextInt();
                }
            }
        }
    }
}
