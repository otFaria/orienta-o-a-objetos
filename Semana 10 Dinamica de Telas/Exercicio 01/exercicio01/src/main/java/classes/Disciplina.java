package classes;
import gerente.GerenteAluno;
import java.util.Objects;

public class Disciplina {
   String nome;
   int semestre;
   String horario;
   Professor ministrante;
   GerenteAluno alunos;

    public Disciplina(){
        nome = "";
        semestre = 0;
        horario = "";
        ministrante = new Professor();
        alunos = new GerenteAluno();
    }

    public Disciplina(String nome, int semestre, String hora, int minutos, Professor ministrante, GerenteAluno alunos) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = hora;
        this.ministrante = ministrante;
        this.alunos = alunos;
    }
    
    @Override
    public String toString(){
        
        String texto = "\nNome da Disciplina: " + nome + ", Semestre: " + semestre + ", Horario: " + horario +  "\nProfessor Ministrante: " + ministrante.getNome() + "\nAlunos Cadastrado na disciplina: \n" + alunos.toString() + "\n";
        
        return texto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + this.semestre;
        hash = 89 * hash + Objects.hashCode(this.ministrante);
        hash = 89 * hash + Objects.hashCode(this.alunos);
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
        final Disciplina other = (Disciplina) obj;
        if (this.semestre != other.semestre) {
            return false;
        }
        
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.ministrante, other.ministrante)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }
      
   public String getNome(){
       return nome;
   }
    
   public void setNome(String nome){
       this.nome = nome;
   }
    
   public GerenteAluno getGerenteAluno(){
       return alunos;
   }
   
   public GerenteAluno getAlunos() {
        return alunos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHora() {
        return horario;
    }

    public void setHora(String hora) {
        this.horario = hora;
    }

    public Professor getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Professor ministrante) {
        this.ministrante = ministrante;
    }

    public void setAlunos(GerenteAluno alunos) {
        this.alunos = alunos;
    }
}
