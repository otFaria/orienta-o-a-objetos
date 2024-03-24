package classes;
import java.util.Objects;

public class Funcionario {
    private String Nome;
    private int Id;
    private double Salario;

    public Funcionario() {
        this.Nome = " ";
        this.Id = 0;
        this.Salario = 0.0;
    }
    
    public Funcionario(String Nome, int Id, double Salario) {
        this.Nome = Nome;
        this.Id = Id;
        this.Salario = Salario;
    }
    
    
    public void Imprimir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String Texto ="\nNome = " + this.Nome + "\nID = " + this.Id + "Salario = " + this.Salario + "\n\n";
        return Texto;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.Id;
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
        final Funcionario other = (Funcionario) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (Double.doubleToLongBits(this.Salario) != Double.doubleToLongBits(other.Salario)) {
            return false;
        }
        return Objects.equals(this.Nome, other.Nome);
    }

    public String getNome() {
        return Nome;
    }

    public int getId() {
        return Id;
    }

    public double getSalario() {
        return Salario;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
}