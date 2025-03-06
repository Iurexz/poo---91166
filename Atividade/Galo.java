package Atividade;

public class Galo implements Animal {

    @Override
    public String emitirSom() {
        return "Cocoricó desgraça";
    }

    @Override
    public String comer() {
       return "Milho";
    }

    @Override
    public String acao() {
        return "Cisca";
}
}