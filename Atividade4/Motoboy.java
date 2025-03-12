package Atividade4;

public class Motoboy extends Funcionario {
    private String placaMoto;

    public Motoboy(String nome, String cpf, String dataNasc, double salarioBase, String placaMoto) {
        super(nome, cpf, dataNasc, salarioBase);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Placa da Moto: " + placaMoto;
               
    }
}
