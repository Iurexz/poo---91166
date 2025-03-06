package Atividade;

public class Gato implements Animal {

    @Override
    public String emitirSom() {
       return "Miau!"; 
    }

    @Override
    public String comer() {
       return "Ração de Salmão"; 
    }

    @Override
    public String acao() {
        return "arranha";
    
}
}