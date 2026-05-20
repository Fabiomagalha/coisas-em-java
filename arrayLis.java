import java.util.ArrayList;

public class arrayLis {
    public static void main(String[] args) {

        ArrayList frutas = new ArrayList<>();

        frutas.add("acerola");
        frutas.add("abacate");
        frutas.add("abacaxi");
        frutas.add("manga");
        frutas.add("manga");

        for(String x: frutas){
            System.out.println(x);
        }
//cumprimento da list
        System.out.println(frutas.size());
//remove
        frutas.remove("abacaxi");
        for(String x:frutas) {
            System.out.println(x);
        }
        frutas.set(3, "melancia");
        for(String x:frutas) {
            System.out.println(x);
        }
    }

}
