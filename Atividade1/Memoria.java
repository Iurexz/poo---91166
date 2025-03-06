package Atividade1;

public class Memoria extends Placa {
    private Double capacidadeDeMemoria;

    public Memoria(String marca, String modelo, Double capacidadeDeMemoria) {
        super(marca, modelo);
        this.capacidadeDeMemoria = capacidadeDeMemoria;
    }

    public Double getCapacidadeDeMemoria() {
        return capacidadeDeMemoria;
    }

    public void setCapacidadeDeMemoria(Double capacidadeDeMemoria) {
        this.capacidadeDeMemoria = capacidadeDeMemoria;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidadeDeMemoria=" + capacidadeDeMemoria + ", modelo=" + modelo + "]";
    }
    

}
