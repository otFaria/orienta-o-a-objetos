package classes;
import java.util.Objects;
public class Aluno {
   
   private int matricula;
   private String nome;
   private String sexo;
   private int idade;
   private int ano_ingresso;
    
   public Aluno() {
       matricula = 0;
       nome = "";
       sexo = "";
       idade = 0;
       ano_ingresso = 0;
   }

    public Aluno(int matricula, String nome, String sexo, int idade, int ano_ingresso) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.ano_ingresso = ano_ingresso;
    }

    @Override
    public String toString() {
        return " Matricula = " + matricula + ", Nome = " + nome + ", Genêro = " + sexo + ", Idade = " + idade + ", Ano_ingresso = " + ano_ingresso + "\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.matricula;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + this.idade;
        hash = 59 * hash + this.ano_ingresso;
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
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (this.ano_ingresso != other.ano_ingresso) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.sexo, other.sexo);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno_ingresso() {
        return ano_ingresso;
    }

    public void setAno_ingresso(int ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }
}