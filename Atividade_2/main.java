package Atividade_2;
import java.util.Scanner;

import Models.Livro;
import Models.Pet;


public class main {
    public static void main(String[] args) {

        

        Scanner lr = new Scanner(System.in);

        System.out.println("Qual o titulo do Livro?");
        String titulo = lr.next();
        System.out.println("Qual o Autor do livro?");
        String autor = lr.next();
        System.out.println("Qual o número de páginas?");
        int nbpag = lr.nextInt();
        System.out.println("Qual o valor deste livro?");
        double valor = lr.nextDouble();

        Livro livro = new Livro(titulo, autor, nbpag,valor);
        
       
       System.out.println("Titulo: " + livro.getTitulo());
       System.out.println("Autor do livro: " + livro.getAutor());
       System.out.println("Número de Páginas: " + livro.getNbpag());
       System.out.println("Preço: R$ " + livro.getValor());
       System.out.println("----------------------------------------------------");




       System.out.println("Qual o nome do Pet?");
       String nome = lr.next();
       System.out.println("Qual a idade do Pet?");
       int idade = lr.nextInt();
       System.out.println("Qual a raça?");
       String raca = lr.next();
       System.out.println("Qual o porte dele?");
       String porte = lr.next();
       System.out.println("Qual o tipo de alimentação?");
       String alimentacao = lr.next();

       Pet pet = new Pet(nome, idade, raca, porte, alimentacao);

       System.out.println("Nome do Pet: " + pet.getNome());
       System.out.println("Idade do PEt: " + pet.getIdade());
       System.out.println("Raça: " + pet.getRaca());
       System.out.println("Porte do Pet " + pet.getPorte());
       System.out.println("O nome da ração: "+ pet.getAlimentacao());
       System.out.println("---------------------------------------------------");










              lr.close();
    //    System.out.println("Titulo: " + livro2.getTitulo());
    //    System.out.println("Autor do livro: " + livro2.getAutor());
    //    System.out.println("Número de Páginas: " + livro2.getNbpag());
    //    System.out.println("Preço: R$ " + livro2.getValor());
    }

    

}