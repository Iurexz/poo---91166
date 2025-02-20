package Relacionamento3;

public class Funcionario {
    private int codeFunc;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private ContaBancaria contaBancaria;


    public Funcionario(int codeFunc, String nome, String endereco, int telefone, String email,
            ContaBancaria contaBancaria) {
        this.codeFunc = codeFunc;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }


    public int getCodeFunc() {
        return codeFunc;
    }


    public void setCodeFunc(int codeFunc) {
        this.codeFunc = codeFunc;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }


    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }


    @Override
    public String toString() {
        return "Funcionario [codeFunc=" + codeFunc + ", nome=" + nome + ", endereco=" + endereco + ", telefone="
                + telefone + ", email=" + email + ", contaBancaria=" + contaBancaria + "]";
    }

    

    
}
