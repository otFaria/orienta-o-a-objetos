package classes;
import java.util.Objects;
public class Autor {
    
    private String Nome;
    private String CidadeNatal;

    public Autor() {
        this.Nome = " ";
        this.CidadeNatal = " ";
    }
    
    public Autor(String Nome, String CidadeNatal) {
        this.Nome = Nome;
        this.CidadeNatal = CidadeNatal;
    }
    
    @Override
    public String toString() {
        String Texto ="\nNome = " + Nome + "Cidade Natal = " + this.CidadeNatal + "\n\n";
        return Texto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Nome);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return Objects.equals(this.CidadeNatal, other.CidadeNatal);
    }
       
    public void imprimir(){
        System.out.println(this);
    }

    public String getNome() {
        return Nome;
    }

    public String getCidadeNatal() {
        return CidadeNatal;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCidadeNatal(String CidadeNatal) {
        this.CidadeNatal = CidadeNatal;
    }
    
}