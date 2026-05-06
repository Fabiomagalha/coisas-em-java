import java.util.Scanner;

public class arrayidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] idade = new int[10];
        int idade_menor = 1;
        int idade_maior = 1;
        int maior = 0;


        for (int i = 0; i <10; i++) {
            System.out.println("qual a sua "+ i + " idade?");
            idade[i] = sc.nextInt();
            if (idade[i] < idade_menor) {
                idade_menor = idade[i];
            }
            if (idade_maior < idade[i]){
                idade_maior = idade[i];
            }
            if (idade[i] >= 35){
                maior++;
            }
        }
        System.out.println("essa foi a maior idade " + idade_maior);
        System.out.println("a menor idade encontrada foi " + idade_menor);
        System.out.println("numero de idades maiores que 35 foi " + maior);


    }

}
