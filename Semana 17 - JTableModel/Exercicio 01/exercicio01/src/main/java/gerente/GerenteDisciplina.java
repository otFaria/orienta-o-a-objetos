package gerente;

import classes.Disciplina;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import serializador.FilePersistence;
import serializador.SerializadorJson;

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
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializando XML
        SerializadorJson serializador_jason = new SerializadorJson();
        String jsonData = serializador_jason.toJsonDisciplina(disciplinas);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.SaveToFile(jsonData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.LoadFromFile(caminhoDoArquivo);

        //Desserializando JSON
        SerializadorJson desserializador_json = new SerializadorJson();
        this.disciplinas = desserializador_json.fromJsonDisciplina(jsonData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
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
