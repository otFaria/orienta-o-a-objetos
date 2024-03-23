package classes;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String Nome;
    private List<Album> albuns;

    public Artista() {
        this.Nome = " ";
        this.albuns = new ArrayList<>();
    }

    public Artista(String Nome, List<Album> albuns) {
        this.Nome = Nome;
        this.albuns = albuns;
    }
    
    //Getters And Setters
    
    public String getNome(){
        return this.Nome;
    }
    
    public List<Album> getAlbum(){
        return this.albuns;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public void setAlbuns(List<Album> A1){
        this.albuns = A1;
    }
    
    
}
