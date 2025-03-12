package Atividade4;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataNasc, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Nascimento: " + dataNasc + "\n" +
               "Salário Base: " + salarioBase;
    }
}
