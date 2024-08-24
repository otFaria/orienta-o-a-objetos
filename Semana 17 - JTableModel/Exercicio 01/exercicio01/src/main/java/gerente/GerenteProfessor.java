package gerente;

import classes.Pessoa;
import classes.Professor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import serializador.FilePersistence;
import serializador.SerializadorJson;
import interfaces.IGerentePessoa;

public class GerenteProfessor implements IGerentePessoa{
    private List<Professor> professores;

    public GerenteProfessor(){
        professores = new ArrayList<>();
    }
    
    @Override
    public void Adiciona(Pessoa P1){
        if (Busca(P1.getCpf()) == null) {
            professores.add( (Professor) P1);
        }else{
            System.out.println("Já existe este professor.");
        }
    }
    
    @Override
    public void Remover(int cpf){
        Professor remover = Busca(cpf);
        
        if(remover != null){
            professores.remove(remover);
            System.out.println("\nProfessor removido com sucesso.");
        }else{
            System.out.println("\nProfessor não encontrado");
        }
    }
    
    @Override
    public void Editar(int cpf, Pessoa novo_professor){
        Professor atualizar = Busca(cpf);
        if(atualizar != null){
            int index = professores.indexOf(atualizar);
            professores.set(index,(Professor) novo_professor);
        }else{
            System.out.println("\nEste professor não existe.");
        }
    }
    
    @Override
    public Professor Busca(int cpf){
        
        for(Professor P1 : professores){
            if (P1.getCpf() == cpf){
                return P1; 
            }
        }
        
        return null;
    }

    @Override
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializando XML
        SerializadorJson serializador_jason = new SerializadorJson();
        String jsonData = serializador_jason.toJsonProfessor(professores);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.SaveToFile(jsonData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    @Override
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.LoadFromFile(caminhoDoArquivo);

        //Desserializando JSON
        SerializadorJson desserializador_json = new SerializadorJson();
        this.professores = desserializador_json.fromJsonProfessores(jsonData);

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