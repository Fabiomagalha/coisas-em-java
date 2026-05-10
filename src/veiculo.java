import java.util.Scanner;

public class veiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual a placa do seu carro (4 digitos)");
        int placa = sc.nextInt();

        switch (placa%10) {
            case 0:
                System.out.println("deve realizar a vistoria em janeiro do proximo ano");
                break;
            case 1:
                System.out.println("deve realizar a vistoria em fevereiro do proximo ano");
                break;
            case 2:
                System.out.println("deve realizar a vistoria em março do proximo ano");
                break;
            case 3:
                System.out.println("deve realizar a vistoria em abril do proximo ano");
                break;
            case 4:
                System.out.println("deve realizar a vistoria em maio do proximo ano");
                break;
            case 5:
                System.out.println("deve realizar a vistoria em junho do proximo ano");
                break;
            case 6:
                System.out.println("deve realizar a vistoria em setembro do proximo ano");
                break;
            case 7:
                System.out.println("deve realizar a vistoria em outubro do proximo ano");
                break;
            case 8:
                System.out.println("deve realizar a vistoria em novembro do proximo ano");
                break;
            case 9:
                System.out.println("deve realizar a vistoria em dezembro do proximo ano");
                break;
            default:
                System.out.println("confira se voce realmente digitou a placa correta");
        }
    }
}
