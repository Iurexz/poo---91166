package Atividade4;

public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.4);
    private final double value;

    Bonificacao(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
