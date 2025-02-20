package Relacionamento3;

public class ContaBancaria {
    private String banco;
    private Double agencia;
    private int numeroCC;
    private String tipoCC;
    private Double saldo;
    private Double limiteDisp;


    public ContaBancaria(String banco, Double agencia, int numeroCC, String tipoCC, Double saldo, Double limiteDisp) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroCC = numeroCC;
        this.tipoCC = tipoCC;
        this.saldo = saldo;
        this.limiteDisp = limiteDisp;
    }
   


public String getBanco() {
    return banco;
}


public void setBanco(String banco) {
    this.banco = banco;
}


public Double getAgencia() {
    return agencia;
}


public void setAgencia(Double agencia) {
    this.agencia = agencia;
}


public int getNumeroCC() {
    return numeroCC;
}


public void setNumeroCC(int numeroCC) {
    this.numeroCC = numeroCC;
}


public String getTipoCC() {
    return tipoCC;
}


public void setTipoCC(String tipoCC) {
    this.tipoCC = tipoCC;
}


public Double getSaldo() {
    return saldo;
}


public void setSaldo(Double saldo) {
    this.saldo = saldo;
}


public Double getLimiteDisp() {
    return limiteDisp;
}


public void setLimiteDisp(Double limiteDisp) {
    this.limiteDisp = limiteDisp;
}



@Override
public String toString() {
    return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", numeroCC=" + numeroCC + ", tipoCC=" + tipoCC
            + ", saldo=" + saldo + ", limiteDisp=" + limiteDisp + "]";
} 

    

    
}
