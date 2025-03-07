package Atividade3;

public abstract class Funcionario {
    protected String nome;
    protected String dataNasc;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    
    public Funcionario(String nome, String dataNasc, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDataNasc() {
    return dataNasc;
}

public void setDataNasc(String dataNasc) {
    this.dataNasc = dataNasc;
}

public Sexo getSexo() {
    return sexo;
}

public void setSexo(Sexo sexo) {
    this.sexo = sexo;
}

public Setor getSetor() {
    return setor;
}

public void setSetor(Setor setor) {
    this.setor = setor;
}

public double getSalarioBase() {
    return salarioBase;
}

public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}}


    public Funcionario(String nome, String dataNasc, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public abstract double getSalarioFinal();



}
