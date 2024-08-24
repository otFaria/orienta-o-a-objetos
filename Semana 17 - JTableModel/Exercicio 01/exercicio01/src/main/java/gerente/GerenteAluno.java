package gerente;

import classes.Aluno;
import classes.Pessoa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import serializador.FilePersistence;
import serializador.SerializadorJson;
import interfaces.IGerentePessoa;

public class GerenteAluno implements IGerentePessoa{
    private List<Aluno> alunos;

    public GerenteAluno(){
        alunos = new ArrayList<>();
    }
    
    @Override
    public void Adiciona(Pessoa A1){
 
        Aluno alunoExistente = Busca(A1.getCpf());

        if( alunoExistente == null){
            alunos.add((Aluno) A1);
            System.out.println("\nAluno adicionado com sucesso.");
        }else{
            System.out.println("\nJá existe um aluno com está matricula.");
        }
    }
    
    @Override
    public void Remover(int matricula){
        
        Aluno remover = Busca(matricula);
        
        if (alunos.isEmpty()) {
            System.out.println("A Lista está vazia.");  
        }else if(Busca(remover.getMatricula()) != null){
            alunos.remove(remover);
        }else{
            System.out.println("\nAluno não encontrado.");
        }
    }
    
    @Override
    public void Editar(int cpf, Pessoa aluno_novo){
        Aluno B1 = Busca(cpf);
        
        if(B1 != null){
            int index = alunos.indexOf(B1);
            alunos.set(index, (Aluno) aluno_novo);
            System.out.println("Aluno editado com sucesso.");
        }else{
            System.out.println("\nAluno não encontrado");
        }
    }
    
    @Override
    public Aluno Busca(int cpf){
            for(Aluno B1: alunos){
                if (B1.getCpf() == cpf){
                    return B1;
                }
            }
            return null;
    }
    
    @Override
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializando XML
        SerializadorJson serializador_jason = new SerializadorJson();
        String jsonData = serializador_jason.toJsonAluno(alunos);
        
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
        this.alunos = desserializador_json.fromJsonAlunos(jsonData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
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