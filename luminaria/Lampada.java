package luminaria;

public class Lampada {
    private int potencia;
    private String soquete;
    private String tensao;
    private String cor;
    private double temperatura;
    private double peso;

    public void ligar() {
        System.out.println(" lampada ligada!");
    }

    public void desligar() {
        System.out.println("lampada desligada");
    }

    public Lampada(int potencia, String soquete, String tensao, String cor, double temperatura, double peso) {
        this.potencia = potencia;
        this.soquete = soquete;
        this.tensao = tensao;
        this.cor = cor;
        this.temperatura = temperatura;
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public String getSoquete() {
        return soquete;
    }


    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }


    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String info() {
        return ">> informações da lampada: <<" +
                "\n potência: " + potencia + "w" +
                "\n soquete: " + soquete +
                "\n tensão: " + tensao +
                "\n cor: " + cor +
                "\n temperatura: " + temperatura +
                "\n peso: " + peso + "kg";
    }
}