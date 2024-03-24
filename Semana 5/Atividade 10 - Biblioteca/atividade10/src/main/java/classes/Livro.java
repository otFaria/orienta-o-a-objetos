package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Livro {
    private String Titulo;
    private List<Autor> autores;
    private int AnoPublicacao;

    public Livro() {
        this.Titulo = " ";
        this.autores = new ArrayList<>();
        this.AnoPublicacao = 0;
    }
    
    public Livro(String Titulo, int AnoPublicacao) {
        this.Titulo = Titulo;
        this.AnoPublicacao = AnoPublicacao;
        this.autores = new ArrayList<>();
    }

      @Override
    public String toString() {
        String Texto ="\nTitulo = " + this.Titulo + "Autor = " + this.autores + "Ano de Publicação: " + this.AnoPublicacao + "\n\n";
        return Texto;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void adicionarAutor(Autor autor){
        this.autores.add(autor);        
    }
                                                                                
    public void removerAutor(String nomeAutor){
        Autor autor = this.encontrarAutor(nomeAutor);
        this.autores.remove(autor);
    }
    
    public Autor encontrarAutor(String nomeAutor){
        for(Autor autor: this.autores){
            if(autor.getNome().equals(nomeAutor)){
                return autor;
            }
        }
        return null;
    }
    
    public List<Autor> encontrarAutorPelaCidade(String nomeCidade){
        List<Autor> autoresEncontrados = new ArrayList<>();
        
        for(Autor autor: this.autores){
            if(autor.getCidadeNatal().equals(nomeCidade)){
                autoresEncontrados.add(autor);
            }
        }
        
        return autoresEncontrados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.Titulo);
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
        final Livro other = (Livro) obj;
        if (this.AnoPublicacao != other.AnoPublicacao) {
            return false;
        }
        if (!Objects.equals(this.Titulo, other.Titulo)) {
            return false;
        }
        return Objects.equals(this.autores, other.autores);
    }

    public String getTitulo() {
        return Titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public int getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void setAnoPublicacao(int AnoPublicacao) {
        this.AnoPublicacao = AnoPublicacao;
    }
}
