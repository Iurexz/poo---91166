package Atividade4;

public class MainAtv {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "01/01/2000", 1500.00, "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "01/01/1990", 5000.00, Bonificacao.GERENTE);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        gerente.Admitir(motoboy);

        
        
    }
}
