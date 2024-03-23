package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    
    private String Nome;
    private String Matricula;
    private String Email;
    private String Curso;
    private List<Telefone> telefones;

    public Aluno() {
        this.Nome = " ";
        this.Matricula = " ";
        this.Email = " ";
        this.Curso = " ";
        this.telefones = new ArrayList();
    }
    
    public Aluno(String Nome, String Matricula, String Email, String Curso, List<Telefone> telefones) {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.Email = Email;
        this.Curso = Curso;
        this.telefones = telefones;
    }
    
    public void Imprimrir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome = " + Nome 
                + ", Matricula = " + Matricula 
                + ", Email = " + Email 
                + ", Curso = " + Curso 
                + ", telefones = " + telefones 
                + '}';
    }
    
    public void copia(Aluno A1){
        this.Nome = A1.getNome();
        this.Matricula = A1.getMatricula();
        this.Email = A1.getEmail();
        this.Curso = A1.getCurso();
        this.telefones = A1.getTelefones();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Nome);
        hash = 79 * hash + Objects.hashCode(this.Matricula);
        hash = 79 * hash + Objects.hashCode(this.Email);
        hash = 79 * hash + Objects.hashCode(this.Curso);
        hash = 79 * hash + Objects.hashCode(this.telefones);
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
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.Matricula, other.Matricula)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.Curso, other.Curso)) {
            return false;
        }
        return Objects.equals(this.telefones, other.telefones);
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    
}
