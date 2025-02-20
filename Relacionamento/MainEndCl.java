package Relacionamento;

public class MainEndCl {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua 69", 71, "Jaboatão");
        Cliente cliente1 = new Cliente("Feto", 21, endereco1);
        
        System.out.println(cliente1.toString());
        
        Cliente cliente2 = new Cliente("Feto", 21,
        new Endereco("Rua viado", 24, "do caralho"));
        
        System.out.println(cliente2.toString());
        
    }
}
