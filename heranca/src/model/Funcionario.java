package model;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String cpf, String nome, String cargo, double salario) {
        super(cpf, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Dados do Funcionario" +
                "\n Nome: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n Cargo: " + cargo +
                "\n Salario: " + salario;

    }
}
