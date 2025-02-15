package Atividade_4;

public class Cliente {
    private String nome;
    private int idade;
    private Double cpf;
    private String adress;
    private int telefone;

    
    public Cliente(String nome, int idade, Double cpf, String adress, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.adress = adress;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Double getCpf() {
        return cpf;
    }


    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }


    public String getAdress() {
        return adress;
    }


    public void setAdress(String adress) {
        this.adress = adress;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    

}
