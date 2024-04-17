package classes;

import java.util.Objects;

public class Musica {
    private Integer id;
    private String titulo;
    private String artista;
    public Integer duracao;
    public Double preco;
    
    public Musica(){
        this.id = 0;
        this.titulo = "";
        this.artista = "";
        this.duracao = 0;
        this.preco = 0.0;
    }

    public Musica(Integer id, String titulo, String artista, Integer duracao, Double preco) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getArtista(){
        return artista;
    }
    
    public Integer getDuracao(){
        return duracao;
    }
    
    public Double getPreco(){
        return preco;
    }
    
    public Integer getID(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.artista);
        hash = 79 * hash + Objects.hashCode(this.duracao);
        hash = 79 * hash + Objects.hashCode(this.preco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musica other = (Musica) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.artista, other.artista)) {
            return false;
        }
        if (!Objects.equals(this.duracao, other.duracao)) {
            return false;
        }
        return Objects.equals(this.preco, other.preco);
    }
    
    @Override
    public String toString() {
        return "\nID:" +this.id + ", Titulo = " + titulo + ", Artista = " + artista + ", Duracao = " + duracao + ", Preco = " + preco;
    }
}
