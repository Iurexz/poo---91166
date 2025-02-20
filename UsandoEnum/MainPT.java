package UsandoEnum;

public class MainPT {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(07, "silva", 1568.8, Setor.FINANCEIRO,Sexo.MASCULINO, 19);

        System.out.println(funcionario1.toString());
    }
}
