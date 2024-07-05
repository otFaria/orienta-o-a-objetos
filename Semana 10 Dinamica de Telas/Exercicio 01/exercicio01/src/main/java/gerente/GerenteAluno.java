package gerente;

import JDialog.JDAluno;
import classes.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GerenteAluno {
    private List<Aluno> alunos;

    public GerenteAluno(){
        alunos = new ArrayList<>();
    }
    
    public void AdicionarAlunos(Aluno A1){
        
        Aluno B1 = Busca_Aluno(A1.getMatricula());
             
        if( B1 == null){
            alunos.add(A1);
        }else{
            System.out.println("\nJá existe um aluno com está matricula.");
        }
        System.out.println("\nAluno adicionado com sucesso.");
    }
    
    public void RemoverAluno(int matricula){
        
        Aluno remover = Busca_Aluno(matricula);
        
        if (alunos.isEmpty()) {
            System.out.println("A Lista está vazia.");  
        }else if(Busca_Aluno(remover.getMatricula()) != null){
            alunos.remove(remover);
        }else{
            System.out.println("\nAluno não encontrado.");
        }
    }
    
    public void Editar(int matricula, Aluno aluno_novo){
        Aluno B1 = Busca_Aluno(matricula);
        
        if(B1 != null){
            int index = alunos.indexOf(B1);
            alunos.set(index, aluno_novo);
            System.out.println("Aluno editado com sucesso.");
        }else{
            System.out.println("\nAluno não encontrado");
        }
    }
    
    public Aluno Busca_Aluno(int matricula){
            for(Aluno B1: alunos){
                if (B1.getMatricula() == matricula){
                    return B1;
                }
            }
            return null;
    }

    @Override
    public String toString() {
        return "Alunos = " + alunos;
    }
    
    public GerenteAluno(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
