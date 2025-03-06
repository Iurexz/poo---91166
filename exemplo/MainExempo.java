package exemplo;

public class MainExempo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Silva", 21, "10/02/2034", "Débito");
        Funcionario funcionario1 = new Funcionario("Costa", 89, "L2323", "Estagiário", 3979.1);
        

        System.out.println(cliente.toString());
        System.out.println(funcionario1.toString());

    }
}
