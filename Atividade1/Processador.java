package Atividade1;

public class Processador extends Placa {
    private Double frequencia;

    public Processador(String marca, String modelo, Double frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo + "]";
    }

    

}
