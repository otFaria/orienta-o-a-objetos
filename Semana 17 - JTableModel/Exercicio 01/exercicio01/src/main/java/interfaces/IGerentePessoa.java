package interfaces;


import classes.Pessoa;
import java.io.IOException;

public interface IGerentePessoa {
    
    
    public void Adiciona(Pessoa P1);
    
    public void Remover(int cpf);
    
    public void Editar(int cpf, Pessoa P1);
    
    public Pessoa Busca(int cpf);
    
    public void salvarNoArquivo(String caminhoDoArquivo)throws IOException ;
    
    public void carregarDoArquivo(String caminhoDoArquivo)throws IOException ;
}