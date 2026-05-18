import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o codigo do seu produto?");
        System.out.println("1 - alimento não perecivel");
        System.out.println("2, 3, 4 - alimento perecivel");
        System.out.println("5 ou 6 - vestuario");
        System.out.println("7 - higiene pessoal");
        System.out.println("8 até 12 - limpezase utensilios domesticos");

        int code = sc.nextInt();
        switch (code) {
            case 1:
                System.out.println("alimento não perecivel");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("alimento perecivel");
                break;
            case 5:
            case 6:
                System.out.println("vestuario");
                break;
            case 7:
                System.out.println("higiene pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("limpezas e domesticods");
                break;
            default:
                System.out.println("codigo invalido");
                break;
        }
    }
}
