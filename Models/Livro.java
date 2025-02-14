package Models;

public class Livro {
    private String titulo;
    private String autor;
    private int nbpag;
    private double valor;
    public Livro(String titulo, String autor, int nbpag, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.nbpag = nbpag;
        this.valor = valor;
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
    public int getNbpag() {
        return nbpag;
    }
    public void setNbpag(int nbpag) {
        this.nbpag = nbpag;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
