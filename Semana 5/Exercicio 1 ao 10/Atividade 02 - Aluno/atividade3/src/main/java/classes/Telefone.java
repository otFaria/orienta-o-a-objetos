package classes;

import java.util.Objects;

public class Telefone {
    
    private int DDD;
    private String Numero;
    private String Descricao;
    private String Operadora;

    public Telefone() {
        this.DDD = 0;
        this.Numero = " ";
        this.Descricao = " ";
        this.Operadora = " ";
    }

    public Telefone(int DDD, String Numero, String Descicao, String Operadora) {
        this.DDD = DDD;
        this.Numero = Numero;
        this.Descricao = Descicao;
        this.Operadora = Operadora;
    }
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    public void Copiar(Telefone T1){
        this.DDD = T1.getDDD();
        this.Numero = T1.getNumero();
        this.Descricao = T1.getDescicao();
        this.Operadora = T1.getOperadora();
    }

    @Override
    public String toString() {
        return "Telefone{" + "DDD =" + DDD 
                + ", Numero =" + Numero 
                + ", Descicao =" + Descricao 
                + ", Operadora =" + Operadora 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.DDD;
        hash = 31 * hash + Objects.hashCode(this.Operadora);
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
        final Telefone other = (Telefone) obj;
        if (this.DDD != other.DDD) {
            return false;
        }
        if (!Objects.equals(this.Numero, other.Numero)) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        return Objects.equals(this.Operadora, other.Operadora);
    }
    
    

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getDescicao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String Operadora) {
        this.Operadora = Operadora;
    }
}