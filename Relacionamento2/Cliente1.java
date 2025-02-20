package Relacionamento2;

public class Cliente1 {
    private String nome;
    private int idade;
    private Pet1 pet;


    public Cliente1(String nome, int idade, Pet1 pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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


    public Pet1 getPet() {
        return pet;
    }


    public void setPet(Pet1 pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Cliente1 [nome=" + nome + ", idade=" + idade + ", pet=" + pet + "]";
    }


    
    
}
