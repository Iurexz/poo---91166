package Atividade4;

public abstract class CargoConfianca extends Funcionario{
   protected Bonificacao bonificacao;

public CargoConfianca(String nome, String cpf, String dataNasc, double salarioBase, Bonificacao bonificacao) {
    super(nome, cpf, dataNasc, salarioBase);
    this.bonificacao = bonificacao;
}

public Bonificacao getBonificacao() {
    return bonificacao;
}

public void setBonificacao(Bonificacao bonificacao) {
    this.bonificacao = bonificacao;
}

   @Override
    public String toString() {
         return super.toString() + "\n" +
                  "Bonificação: " + bonificacao.getValue();
    }
    

    

}
