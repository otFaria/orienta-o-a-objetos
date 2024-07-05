package gerente;

import classes.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class GerenteDisciplina {
    
    public List<Disciplina> disciplinas;
   
    public GerenteDisciplina(){
        disciplinas = new ArrayList<>();
    }

    public GerenteDisciplina(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void Adicionar_Disciplina(Disciplina serAdicionada){
        Disciplina D1 = Buscar_Disciplina(serAdicionada.getNome());
        
        if (D1 == null) {
            disciplinas.add(serAdicionada);
        }else{
            System.out.println("\nJá existe está disciplina.");
        }
    }
    
    public void Remover_Disciplina(String nome){
        Disciplina selecionada = Buscar_Disciplina(nome);
        
        if (selecionada != null) {
            disciplinas.remove(selecionada);
        }else{
            System.out.println("\nDisciplina inexistente.");
        }
    }
    
    public void Atualiza_Disciplina(String nome , Disciplina novaDisciplina){
        Disciplina serAtualizada = Buscar_Disciplina(nome);
        
        if(serAtualizada!= null){
            int index_disciplina = disciplinas.indexOf(serAtualizada);
            disciplinas.set(index_disciplina, novaDisciplina);
        }
    }
   
    public Disciplina Buscar_Disciplina(String nome){
        for(Disciplina D1 : disciplinas){
            if (D1.getNome().equalsIgnoreCase(nome)){
                return D1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\n\nDisciplinas = \n\n" + disciplinas + "\n";
    }
    
    

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
