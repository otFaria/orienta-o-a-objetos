package classes;
import java.util.Objects;
public class ContaBancaria {
    private double Saldo;
    private int Numero;
    private String NomeBanco;
    private int Id;
    
    public ContaBancaria(){
        this.Saldo = 0.0;
        this.Numero = 0;
        this.NomeBanco = "";
        this.Id = 0;
    }
    
    public ContaBancaria(double Saldo, int Numero, String NomeBanco, int Id){
        this.Saldo = Saldo;
        this.Numero = Numero;
        this.NomeBanco = NomeBanco;
        this.Id = Id;
    }

    @Override
    public String toString(){
        String Texto = "\nID:" + this.Id + "\nNumero:" + this.Numero + "\nSaldo:" + this.Saldo + "\nNome Banco:" + this.NomeBanco + "\n\n";
        return Texto;
    }
    
    public void imprimir(){
        System.out.println(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.Numero;
        hash = 67 * hash + this.Id;
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
        final ContaBancaria other = (ContaBancaria) obj;
        if (Double.doubleToLongBits(this.Saldo) != Double.doubleToLongBits(other.Saldo)) {
            return false;
        }
        if (this.Numero != other.Numero) {
            return false;
        }
        if (this.Id != other.Id) {
            return false;
        }
        return Objects.equals(this.NomeBanco, other.NomeBanco);
    }
    
    public double getSaldo() {
        return Saldo;
    }

    public int getNumero() {
        return Numero;
    }

    public String getNomeBanco() {
        return NomeBanco;
    }

    public int getId() {
        return Id;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setNomeBanco(String NomeBanco) {
        this.NomeBanco = NomeBanco;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
}