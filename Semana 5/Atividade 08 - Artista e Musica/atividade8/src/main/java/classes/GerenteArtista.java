package classes;

import java.util.ArrayList;
import java.util.List;
public class GerenteArtista{
    
    private List<Artista> artistas;

    public GerenteArtista() {
        this.artistas = new ArrayList<>();    
    }
    
    public void Copiar(List<Artista> A1){
        this.artistas = A1;
    }
    
    public Artista MaiorNumAlbum(){
        Artista Maior = new Artista();
        int MaiorNumAlbum = 0;
        
        for (Artista A1 : artistas){
            if (A1.getAlbum().size() > MaiorNumAlbum){
                MaiorNumAlbum = A1.getAlbum().size();
                Maior = A1;
            }
        }
        return Maior;
    }
    
    public Artista MaiorNumMusica(){
        Artista Maior = new Artista();
        int MaiorNumMusica = 0;
        int SomaMusicas = 0;
        
        for (int i = 0; i < artistas.size(); i++){
            
            SomaMusicas = 0;
            
            for(int j = 0; j < artistas.get(i).getAlbum().size(); j++){
                SomaMusicas += artistas.get(i).getAlbum().get(j).getMusicas().size();
            }
            if(SomaMusicas > MaiorNumMusica){
                MaiorNumMusica = SomaMusicas;
                Maior = artistas.get(i);
            }
        }
        return Maior;
    }
    
    public List<Artista> getArtistas(){
        return this.artistas;
    }
    
    public void setArtista(List<Artista> A1){
       this.artistas = A1;
    }
    
}


