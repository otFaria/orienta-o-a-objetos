package gerente;

import classes.Professor;
import java.util.ArrayList;
import java.util.List;

public class GerenteProfessor {
    private List<Professor> professores;

    public GerenteProfessor(){
        professores = new ArrayList<>();
    }
    
    public void Adiciona_Professor(Professor P1){
        if (Busca_Professor(P1.getCpf()) == null) {
            professores.add(P1);
        }else{
            System.out.println("Já existe este professor.");
        }
    }
    
    public void Remover(int cpf){
        Professor remover = Busca_Professor(cpf);
        
        if(remover != null){
            professores.remove(remover);
            System.out.println("\nProfessor removido com sucesso.");
        }else{
            System.out.println("\nProfessor não encontrado");
        }
    }
    
    public void Atualizar(int cpf, Professor novo_professor){
        Professor atualizar = Busca_Professor(cpf);
        if(atualizar != null){
            int index = professores.indexOf(atualizar);
            professores.set(index,novo_professor);
        }else{
            System.out.println("\nEste professor não existe.");
        }
    }
    
    public Professor Busca_Professor(int cpf){
        
        for(Professor P1 : professores){
            if (P1.getCpf() == cpf){
                return P1; 
            }
        }
        
        return null;
    }

    @Override
    public String toString() {
        return "Professores = \n" + professores;
    }

    public GerenteProfessor(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}