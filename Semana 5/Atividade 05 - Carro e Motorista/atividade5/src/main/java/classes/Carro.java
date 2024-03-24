package classes;

import java.util.Objects;

public class Carro {
   private String Modelo;
   private String Cor;
   private int Ano;

    public Carro() {
        this.Modelo = " ";
        this.Cor = " ";
        this.Ano = 0;
    }

    public Carro(String Modelo, String Cor, int Ano) {
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.Ano = Ano;
    }

    public void Imprimir(){
        System.out.println("\n" + this + "\n");
    }
    
    public void Buzinar(){
        System.out.println("\n\nO Carro " + this.Modelo + " esta buzinando.");
        System.out.println("PAMM !!!");
    }
    
    public void AbirPorta(){
        System.out.println("\n\nAbrindo a porta do " + this.Modelo + ".");
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.Modelo);
        hash = 83 * hash + Objects.hashCode(this.Cor);
        hash = 83 * hash + this.Ano;
        return hash;
    }
    
    
    @Override
    public String toString(){
        String Texto = "\nModelo: " + this.Modelo + "\nCor: " + this.Cor + "\nAno: " + this.Ano + "\n\n";
        return Texto;
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
        final Carro other = (Carro) obj;
        if (this.Ano != other.Ano) {
            return false;
        }
        if (!Objects.equals(this.Modelo, other.Modelo)) {
            return false;
        }
        return Objects.equals(this.Cor, other.Cor);
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    
    
   
}
