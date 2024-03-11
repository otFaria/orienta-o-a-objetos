package com.mycompany.atividade11.Classe;
import java.util.Scanner;

public class Livro {
    
    private String Autor;
    private String Titulo;
    private int Paginas;
    private double Preco;
    
    //Construtores
    
    public Livro(){
        Autor = " ";
        Titulo = " ";
        Paginas = 0;
        Preco = 0.0;    
    }

    public Livro(String Autor, String Titulo, int Paginas, double Preco) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Paginas = Paginas;
        this.Preco = Preco;
    }
    
    public Livro(Livro Livro2){
        this.Autor = Livro2.Autor;
        this.Titulo = Livro2.Titulo;
        this.Paginas = Livro2.Paginas;
        this.Preco = Livro2.Preco;
    }
    
    //
    
    
    //Copia
    
    public void Copia(Livro Livro2){
        this.Autor = Livro2.Autor;
        this.Titulo = Livro2.Titulo;
        this.Paginas = Livro2.Paginas;
        this.Preco = Livro2.Preco;
    }
    
    //
    
    //Preencher
    
    public void Preencher(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Me informe os dados do livro.");
        
        System.out.print("\nAutor: ");
        this.Autor = ler.next();
        
        System.out.print("\nTitulo: ");
        this.Titulo = ler.next();
        
        System.out.print("\nPaginas: ");
        this.Paginas = ler.nextInt();
        
        System.out.print("\nPreco: ");
        this.Preco = ler.nextDouble();
    }
    
    //Imprimir
    
    @Override
    public String toString() {
        String texto = "\nAutor: " + this.Autor + "\nTitulo: " + this.Titulo + "\nPaginas: " + this.Paginas + "\nPreco: " + this.Preco;
        return texto;
    }
    
    //
    
   //Getters
    
    public String getAutor(){
        return this.Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getPaginas() {
        return Paginas;
    }

    public double getPreco() {
        return Preco;
    }
    
   //Setters

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
    
    
}
