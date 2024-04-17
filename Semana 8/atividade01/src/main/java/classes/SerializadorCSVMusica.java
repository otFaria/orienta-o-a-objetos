package classes;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class SerializadorCSVMusica {
    
    public String toCSV(List<Musica> musicas){
        String csv = "ID;Artista;Titulo;Preço;Duração;\n";
        
        for (Musica musica : musicas) {
            csv += musica.getID() + ";" + musica.getArtista() + ";" + musica.getTitulo() + ";" + musica.getPreco() + ";" + musica.getDuracao() + ";\n";
        }
        
        return csv;
    }
    
    public List<Musica> FromCSV(String data){   
        
        List<Musica> musicas = new ArrayList<>();
        String[] Linhas = data.split("\n");
        
        for (int i = 1; i < Linhas.length; i++) {
            Musica M1 = new Musica();
            String[] partes = Linhas[i].split(";");
          
            if (partes.length >= 5) {
                M1.setId(Integer.parseInt(partes[0]));
                M1.setArtista(partes[1]);
                M1.setTitulo(partes[2]);
                M1.setPreco(Double.parseDouble(partes[3]));
                M1.setDuracao(Integer.parseInt(partes[4]));
                
                musicas.add(M1);
            }
        }
        
        return musicas;
    }
}
