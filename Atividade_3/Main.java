package Atividade_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Qual placa do veiculo? ");
        String placa = scc.next();
        System.out.println("Qual cor do veiculo? ");
        String cor = scc.next();
        System.out.println("Qual o número de passageiros? ");
        int numeroDePassageiros = scc.nextInt();
        System.out.println("Qual a capacidade do Tanque? ");
        Double capacidadeTanque = scc.nextDouble();
        System.out.println("Qual a velocidade Máxima do veiculo? ");
        Double velocidadeMax = scc.nextDouble();
        System.out.println("Qual consumo médio do veiculo? ");
        Double consumoMéd = scc.nextDouble();

        Carro carro = new Carro(placa, cor, numeroDePassageiros, capacidadeTanque, velocidadeMax, consumoMéd);

        System.out.println("Placa do veiculo: " + carro.getPlaca());
        System.out.println("Cor do veiculo: " + carro.getCor());
        System.out.println("Número de passageiros: " + carro.getNumeroDePassageiros() + " Passageiros");
        System.out.println("Capacidade do Tanque: " + carro.getCapacidadeTanque() + " LITROS");
        System.out.println("Velocidade Máxima do veiculo: " + carro.getVelocidadeMax() + "KM/H");
        System.out.println("Consumo médio do veiculo: " + carro.getConsumoMéd() + " Litros de gasolina");


        Livro1 livro = new Livro1("Cabana", "Josep", 234.334,300,150.3);

        






        scc.close();
    }
}
