package classes;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String Nome;
    private int AnoLancamento;
    private List<Musica> musicas;

    //Constructor
    
    public Album() {
        this.Nome = " ";
        this.AnoLancamento = 0;
        this.musicas = new ArrayList<>();
    }

    public Album(String Nome, int AnoLancamento, List<Musica> musicas) {
        this.Nome = Nome;
        this.AnoLancamento = AnoLancamento;
        this.musicas = musicas;
    }
    
    //Copy
    
    public void Copia(Album A1){
        this.Nome = A1.getNome();
        this.AnoLancamento = A1.getAnoLancamento();
        this.musicas = A1.getMusicas();
    }
    
    //Print
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    //ToString

    @Override
    public String toString() {
        String Texto = "\nNome = " + Nome + "\nAno Lançamento = " + AnoLancamento + "\nMusicas = " + musicas ;
        return Texto;
    }
    
    //Getters And Setters
    
    public String getNome(){
        return this.Nome;
    }
    
    public int getAnoLancamento(){
        return this.AnoLancamento;
    }
    
    public List<Musica> getMusicas(){
        return this.musicas;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public void setAnoLancamento(int Ano){
        this.AnoLancamento = Ano;
    }
    
    public void setMusicas(List<Musica> musicas){
        this.musicas = musicas;
    }
}
