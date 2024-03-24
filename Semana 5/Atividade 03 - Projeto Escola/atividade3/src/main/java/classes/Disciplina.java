package classes;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String Nome;
    private int Semestre;
    private String Horario;
    private List<Aluno> alunos;
    private Professor Professor;
    
    public Disciplina(){
      this.Nome = " ";
      this.Semestre = 0;
      this.Horario = " ";
      this.Professor = new Professor();
      this.alunos = new ArrayList<>();
    }

    public Disciplina(String Nome, int Semestre, String Horario, List<Aluno> alunos , Professor Professor) {
        this.Nome = Nome;
        this.Semestre = Semestre;
        this.Horario = Horario;
        this.Professor = Professor;
        this.alunos = alunos;
    }
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    public void Copia(Disciplina A1){
        this.Nome = A1.getNome();
        this.Semestre = A1.getSemestre();
        this.Horario = A1.getHorario();
        this.Professor = A1.getProfessor();
        this.alunos = A1.getAlunos();
    }
    
    @Override
    public String toString(){
        String Texto = "\nNome:  " + this.Nome + "\nSemestre: " + this.Semestre + "\nHorario: " + this.Horario + "\n\nProfessor: " + this.Professor + "\n\nAlunos: " + this.alunos;
        return Texto;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }
    
    public List<Aluno> getAlunos(){
        return this.alunos;
    }
    
    public void setAlunos(List<Aluno> A1){
        this.alunos = A1;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    } 
}
