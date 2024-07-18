package Classes;

import java.util.Objects;
import java.util.Scanner;

public class Produto {
    protected int cod;
    protected String nome;
    protected double preco;
    protected double custo;
    
    public Produto(){
        this.cod = 0;
        this.nome = "";
        this.preco = 0.0;
        this.custo = 0.0; 
    }

    public Produto(int cod, String nome, double preco, double custo) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
    }
    
    public void Preencher(){
        
        Scanner ler = new Scanner(System.in);
        System.out.print("\nCodigo: ");
        this.cod = ler.nextInt();
        
        System.out.print("\nNome: ");
        this.nome = ler.next();
        
        System.out.print("\nCusto: ");
        this.custo = ler.nextDouble();
        
        System.out.print("\nPreço: ");
        this.preco = ler.nextDouble();
    }
    
    public void Imprimir(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        
        String Produto = "Codigo: " + this.cod + "\nNome: "+ this.nome + "\nCusto: " + this.custo + "\nPreço: " + this.preco;
        
        return Produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cod;
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
        final Produto other = (Produto) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (Double.doubleToLongBits(this.custo) != Double.doubleToLongBits(other.custo)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
