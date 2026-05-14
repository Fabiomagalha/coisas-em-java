import java.util.Scanner;

public class dado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("la vai o dado...");
        int resultado = (int)(Math.random() * 6) + 1;
        System.out.println("Resultado do dado: " + resultado);
    }
}