import java.util.Scanner;


public class metodos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        imprimir();
        System.out.println(calculo(x, y));


    }
    static void imprimir(){
        System.out.println("teste");
    }
    static int calculo(int a, int b){
        return a + b;
    }
}

