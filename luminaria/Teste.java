package luminaria;

public class Teste {
    public static void main(String[] args) {
        Lampada led1 = new Lampada(50, "E27", "bivolt", "branca", 6.500, 0.07);
        
        led1.desligar();
        led1.ligar();
        System.out.println(led1.info());
    }
}
