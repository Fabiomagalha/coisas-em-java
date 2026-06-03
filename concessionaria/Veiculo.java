package concessionaria;

public class Veiculo {
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String modelo, int anoFabricacao, double quilometragem) {
        this.modelo = modelo;
        setAnoFabricacao(anoFabricacao);
        setQuilometragem(quilometragem);
    }

    public Veiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if(anoFabricacao >= 1950 && anoFabricacao <=2026){
            this.anoFabricacao = anoFabricacao;
        }else{
            System.out.println("Valor Inválido");
        }
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        if(quilometragem >= 0){
            this.quilometragem = quilometragem;
        }else{
            System.out.println("Dado inválido para cadastro!");
        }
    }

    public String exibirInfo() {
        return "=== Dados do Veiculo ===" +
                "\n Modelo: " + modelo +
                "\n Ano de Fabricacao: " + anoFabricacao +
                "\n Quilometragem: " + quilometragem + "Km";
    }
}