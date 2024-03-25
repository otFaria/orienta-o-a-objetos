package classes;

import java.util.Objects;

public class Produto {
    private String Nome;
    private double Preco;

    public Produto(String Nome, double Preco) {
        this.Nome = Nome;
        this.Preco = Preco;
    }

    public Produto() {
        this.Nome = " ";
        this.Preco = 0.0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Nome);
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
        if (Double.doubleToLongBits(this.Preco) != Double.doubleToLongBits(other.Preco)) {
            return false;
        }
        return Objects.equals(this.Nome, other.Nome);
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
    
    
}