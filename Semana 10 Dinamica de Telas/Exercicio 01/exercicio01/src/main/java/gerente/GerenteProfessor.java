package gerente;

import classes.Professor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import serializador.FilePersistence;
import serializador.SerializadorJson;

public class GerenteProfessor {
    private List<Professor> professores;

    public GerenteProfessor(){
        professores = new ArrayList<>();
    }
    
    public void Adiciona_Professor(Professor P1){
        if (buscarProfessor(P1.getCpf()) == null) {
            professores.add(P1);
        }else{
            System.out.println("Já existe este professor.");
        }
    }
    
    public void Remover(int cpf){
        Professor remover = buscarProfessor(cpf);
        
        if(remover != null){
            professores.remove(remover);
            System.out.println("\nProfessor removido com sucesso.");
        }else{
            System.out.println("\nProfessor não encontrado");
        }
    }
    
    public void Atualizar(int cpf, Professor novo_professor){
        Professor atualizar = buscarProfessor(cpf);
        if(atualizar != null){
            int index = professores.indexOf(atualizar);
            professores.set(index,novo_professor);
        }else{
            System.out.println("\nEste professor não existe.");
        }
    }
    
    public Professor buscarProfessor(int cpf){
        
        for(Professor P1 : professores){
            if (P1.getCpf() == cpf){
                return P1; 
            }
        }
        
        return null;
    }

    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializando XML
        SerializadorJson serializador_jason = new SerializadorJson();
        String jsonData = serializador_jason.toJson_Professor(professores);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.SaveToFile(jsonData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.LoadFromFile(caminhoDoArquivo);

        //Desserializando JSON
        SerializadorJson desserializador_json = new SerializadorJson();
        this.professores = desserializador_json.fromJson_Professores(jsonData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
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