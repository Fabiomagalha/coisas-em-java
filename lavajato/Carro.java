package lavajato;

public class Carro {
    private String modelo;
    private String placa;
    private String cor;
    private double valorLavagem;

    public Carro(String modelo, String placa, String cor, double ValorLavagem) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.valorLavagem = ValorLavagem;
    }

    public String exibirinfo() {
        return ">> informações da lampada: <<" +
                "\n modelo: " + modelo +
                "\n Placa: " + placa +
                "\n  Cor: " + cor +
                "\n Valor da lavagem: " + valorLavagem;
    }
}
