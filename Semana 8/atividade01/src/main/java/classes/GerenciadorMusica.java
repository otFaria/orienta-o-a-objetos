package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorMusica {

    private List<Musica> musicas;

    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
    }

    public GerenciadorMusica(List<Musica> musicas) {
        this.musicas = musicas;
    }
    
    public void adicionarMusica(Musica musica) {
         this.musicas.add(musica);
    }

    public void removerMusica(Integer ID){
        Musica M1 = buscarMusica(ID);
        
        if(M1 != null){
            int index = musicas.indexOf(M1);
            this.musicas.remove(index);
        }
    }

    public Musica buscarMusica(Integer ID) {
        Musica M1;
        
        for (Musica musica : musicas) {
            if(musica.getID() == ID){
                M1 = musica;
                return M1;
            }
        }
        
        return null;
    }

    public void salvarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public void atualizarMusica(Integer ID, Musica musicaNova) {
        
        Musica M1 = buscarMusica(ID);
        
        if(M1 != null){
            Integer index = musicas.indexOf(M1);
            musicas.set(index, musicaNova);
            System.out.println("Musica Atualizada com sucesso.");
        }
        System.out.println("Musica nao encontrada");
    }

    @Override
    public String toString() {
        return "\nMusicas = " + musicas;
    }

    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        SerializadorCSVMusica serializador = new SerializadorCSVMusica();
        
        String dataCSV = serializador.toCSV(musicas);
        
        FilePersistence filepersistence = new FilePersistence();
        filepersistence.saveToFile(caminhoDoArquivo, dataCSV);
        
        System.out.println("Musicas Salvos com Sucesso.");
    }

    
    public void loadDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
            
           FilePersistence file = new FilePersistence();
           String linhaLida = file.loadToFile(caminhoDoArquivo);
           
           
           SerializadorCSVMusica serializar = new SerializadorCSVMusica();
           this.musicas = serializar.FromCSV(linhaLida);
    }    
    
    public List<Musica> getMusicas(){
        return musicas;
    }
 }

