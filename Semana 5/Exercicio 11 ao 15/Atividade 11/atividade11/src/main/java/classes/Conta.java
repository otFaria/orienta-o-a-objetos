package classes;
import java.util.Objects;

public class Conta {
    
    private int NumeroConta;
    private String Titular;
    private double SaldoConta;

    public Conta(){
      this.NumeroConta = 0;
      this.Titular =  " ";
      this.SaldoConta = 0.0;
    }

    public Conta(int NumeroConta, String Titular, double SaldoConta) {
        this.NumeroConta = NumeroConta;
        this.Titular = Titular;
        this.SaldoConta = SaldoConta;
    }

    @Override
    public String toString() {
        return "\n\nNumeroConta = " + this.NumeroConta + "\nTitular = " + this.Titular + "\nSaldoConta = " + this.SaldoConta + "\n\n";
    }
    
    public void Depositar(double Valor){
        this.SaldoConta += Valor;
    }
    
    public void Sacar(double Valor){
        this.SaldoConta -= Valor;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.NumeroConta;
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
        final Conta other = (Conta) obj;
        if (this.NumeroConta != other.NumeroConta) {
            return false;
        }
        if (Double.doubleToLongBits(this.SaldoConta) != Double.doubleToLongBits(other.SaldoConta)) {
            return false;
        }
        return Objects.equals(this.Titular, other.Titular);
    }
    
    

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldoConta() {
        return SaldoConta;
    }

    public void setSaldoConta(double SaldoConta) {
        this.SaldoConta = SaldoConta;
    }
    
    
    
    
    
}
