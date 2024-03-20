package classes;
import classes.Carro;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Propietario {
    private String Nome;
    private String Email;
    private String CPF;
    private List<Carro> carro;
    
    public Propietario(){
        this.Nome = " ";
        this.Email = " ";
        this.CPF = " ";
        this.carro = new ArrayList<>();
    }

    public Propietario(String Nome, String Email, String CPF, List<Carro> carro) {
        this.Nome = Nome;
        this.Email = Email;
        this.CPF = CPF;
        this.carro = carro;
    }
    
    public Propietario(Propietario P1){
        this.Nome = P1.getNome();
        this.Email = P1.getEmail();
        this.CPF = P1.getCPF();
        this.carro = P1.getCarro();
    }
    
    public void Copia(Propietario P1){
        this.Nome = P1.getNome();
        this.Email = P1.getEmail();
        this.CPF = P1.getCPF();
        this.carro = P1.getCarro();
    }
    
    public void Imprimir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Propietario{" + "Nome = " + Nome 
                + ", Email = " + Email +
                ", CPF = " + CPF 
                + ", carro = " + carro 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Nome);
        hash = 97 * hash + Objects.hashCode(this.Email);
        hash = 97 * hash + Objects.hashCode(this.CPF);
        hash = 97 * hash + Objects.hashCode(this.carro);
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
        final Propietario other = (Propietario) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.carro, other.carro);
    }
    
    
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public List<Carro> getCarro() {
        return carro;
    }

    public void setCarro(List<Carro> carro) {
        this.carro = carro;
    }
}
