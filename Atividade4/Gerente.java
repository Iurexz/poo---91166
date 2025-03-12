package Atividade4;

public class Gerente extends CargoConfianca implements Contratacao{
     
public Gerente(String nome, String cpf, String dataNasc, double salarioBase, Bonificacao bonificacao) {
    super(nome, cpf, dataNasc, salarioBase, bonificacao);
}


    @Override
    public void Admitir(Funcionario funcionario) {
        System.out.println("Gerente admitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public void Demitir(Funcionario funcionario) {
        System.out.println("Gerente demitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public double obterSalarioFinal() {
        return this.salarioBase * this.bonificacao.getValue();
    }

    @Override 
    public String toString() {
        return super.toString() + "\n" +
               "Salário Final: " + obterSalarioFinal();
    }
}
