package Atividade1;

public class MainMPP {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Ryzen", "7600g", 3.67);
        Memoria memoria = new Memoria("Kingston", "SM1TB", 1.000);


        System.out.println(processador1.toString());
        System.out.println(memoria.toString());
    }
}
