package Atividade_3;

public class Livro1 {
    private String titulo;
    private String autor;
    private Double isbn; 
    private int numberDpags;
    private Double valorDeCompra;


    public Livro1(String titulo, String autor, Double isbn, int numberDpags, Double valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numberDpags = numberDpags;
        this.valorDeCompra = valorDeCompra;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public Double getIsbn() {
        return isbn;
    }


    public void setIsbn(Double isbn) {
        this.isbn = isbn;
    }


    public int getNumberDpags() {
        return numberDpags;
    }


    public void setNumberDpags(int numberDpags) {
        this.numberDpags = numberDpags;
    }


    public Double getValorDeCompra() {
        return valorDeCompra;
    }


    public void setValorDeCompra(Double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }


    
    
}
