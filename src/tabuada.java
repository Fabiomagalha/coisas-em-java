import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("de qual número você deseja ver a tabuada?");
        int num = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (i*num));
            i = i + 1;
        }
    }
}
