package classes;
import java.awt.BorderLayout;
import java.util.Objects;

public class Professor {
    private int cpf;
    private String nome;
    private String sexo;
    private int idade;
    
    public Professor(){
        cpf = 0;
        nome = "";
        sexo = "";
        idade = 0;
    }

    public Professor(int cpf, String nome, String sexo, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public void Imprimir(){
        System.out.print(this);
    }
    
    @Override
    public String toString() {
        return " Cpf = " + cpf + ", Nome = " + nome +  ", Sexo = " + sexo + ", Idade = " + idade + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.cpf;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.sexo);
        hash = 31 * hash + this.idade;
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
        final Professor other = (Professor) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.sexo, other.sexo);
    }
    
    
    
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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
}
