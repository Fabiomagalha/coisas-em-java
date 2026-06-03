package concessionaria;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo vw = new Veiculo();

        System.out.println("Digite o modelo do Veiculo");
        vw.setModelo(sc.nextLine());

        int ano;
        do {
            System.out.println("Digite o ano de Fabricação");
            ano = sc.nextInt();
            vw.setAnoFabricacao(ano);
        }while (ano < 1950 || ano > 2026);

        double km;
        do {
            System.out.println("Digite a Quilometragem");
            km = sc.nextDouble();
            vw.setQuilometragem(km);
        }while (km < 0);

        System.out.println(vw.exibirInfo());


        sc.close();
    }
}

