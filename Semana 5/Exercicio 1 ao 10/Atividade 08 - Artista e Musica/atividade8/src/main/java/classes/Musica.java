package classes;

import java.util.Objects;

public class Musica {
    private double Duracao;
    private String Titulo;
    
    //Constructor

    public Musica() {
        this.Duracao = 0.0;
        this.Titulo = " ";
    }
    
    public Musica(double Duracao, String Titulo) {
        this.Duracao = Duracao;
        this.Titulo = Titulo;
    }
    
    //Copy
    
    public void Copiar(Musica M1){
        this.Titulo = M1.getTitulo();
        this.Duracao = M1.getDuracao();
    }
    
    //Print
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    //ToString
    
    @Override
    public String toString(){
        String Texto = "\nTitulo: " + this.Titulo + "\nDuração: " + this.Duracao;
        return Texto;
    }
    
    //HashCoode And Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musica other = (Musica) obj;
        if (Double.doubleToLongBits(this.Duracao) != Double.doubleToLongBits(other.Duracao)) {
            return false;
        }
        return Objects.equals(this.Titulo, other.Titulo);
    }
    
    //Getters and Setters
    
    public double getDuracao() {
        return Duracao;
    }

    public void setDuracao(double Duracao) {
        this.Duracao = Duracao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
}
