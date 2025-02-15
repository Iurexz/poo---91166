package Atividade_4;

public class Carro1 {
    private String placa; 
    private String cor;
    private int numeroDePassageiros;
    private Double capacidadeTanque;
    private Double velocidadeMax;
    private Double consumoMéd;
    public Carro1(String placa, String cor, int numeroDePassageiros, Double capacidadeTanque, Double velocidadeMax,
            Double consumoMéd) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumoMéd = consumoMéd;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }
    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }
    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public Double getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(Double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    public Double getConsumoMéd() {
        return consumoMéd;
    }
    public void setConsumoMéd(Double consumoMéd) {
        this.consumoMéd = consumoMéd;
    }


    


}
