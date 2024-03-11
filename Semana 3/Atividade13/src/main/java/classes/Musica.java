package classes;
import java.util.Scanner;
public class Musica {
    
 private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    // Construtores

    public Musica() {
        titulo = " ";
        artista = " ";
        duracao = 0;
        preco = 0.0;
    }

    public Musica(String titulo, String artista, int duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }

    public Musica(Musica outraMusica) {
        this.titulo = outraMusica.titulo;
        this.artista = outraMusica.artista;
        this.duracao = outraMusica.duracao;
        this.preco = outraMusica.preco;
    }

    // Método de cópia

    public void copia(Musica outraMusica) {
        this.titulo = outraMusica.titulo;
        this.artista = outraMusica.artista;
        this.duracao = outraMusica.duracao;
        this.preco = outraMusica.preco;
    }

    // Método de preenchimento

    public void preencher() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe os dados da musica.");

        System.out.print("\nTitulo: ");
        this.titulo = ler.nextLine();

        System.out.print("\nArtista: ");
        this.artista = ler.nextLine();

        System.out.print("\nDuracaoo (em minutos): ");
        this.duracao = ler.nextInt();

        System.out.print("\nPreco: ");
        this.preco = ler.nextDouble();
    }
    
    public void tocarMusica(){
        System.out.println("Estou tocando musica.");
    }

    // Método toString

    @Override
    public String toString() {
        String Texto = "\nTitulo: " + titulo + "\nArtista: " + artista + "\nDuração: " + duracao + " minutos\nPreco: " + preco;
        return Texto;
    }

    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}