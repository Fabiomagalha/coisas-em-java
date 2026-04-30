public class fibonacci {
    public static void main(String[] args) {
        int anterior = 0, atual = 1, aux = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(aux + " ");
            aux = anterior + atual;
            anterior = atual;
            atual = aux;
        }
    }
}