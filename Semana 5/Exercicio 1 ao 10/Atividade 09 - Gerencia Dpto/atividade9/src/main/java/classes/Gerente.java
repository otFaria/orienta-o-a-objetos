
package classes;

import java.util.Objects;


public class Gerente {
    private String Nome;
    private int ID;
    private double Salario;
    private String Area;

    public Gerente(String Nome, int ID, double Salario, String Area) {
        this.Nome = Nome;
        this.ID = ID;
        this.Salario = Salario;
        this.Area = Area;
    }
    
    public Gerente() {
        this.Nome = " ";
        this.ID = 0;
        this.Salario = 0.0;
        this.Area = " ";
    }

    @Override
    public String toString() {
        String Texto ="\nNome = " + this.Nome + "\nID = " + this.ID + "Salario = " + this.Salario + "\nArea: " + this.Area + "\n\n";
        return Texto;
    }
    
    public void imprimir(){
        System.out.println(this);
    }

    public String getNome() {
        return Nome;
    }

    public int getId() {
        return ID;
    }

    public double getSalario() {
        return Salario;
    }

    public String getArea() {
        return Area;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.ID;
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
        final Gerente other = (Gerente) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (Double.doubleToLongBits(this.Salario) != Double.doubleToLongBits(other.Salario)) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return Objects.equals(this.Area, other.Area);
    }
}