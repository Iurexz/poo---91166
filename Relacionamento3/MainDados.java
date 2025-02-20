package Relacionamento3;

public class MainDados {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(9, "Silva", "Rua do 69", 719234073, "6969@gmail.com",
        new ContaBancaria("Itau", 692469.0, 2121928, "Corrente", 100.1, 2000.4));
        
        System.out.println(funcionario1.toString());
    }
}
