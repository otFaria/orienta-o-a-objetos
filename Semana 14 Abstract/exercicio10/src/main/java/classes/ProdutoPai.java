package classes;
public class ProdutoPai {
    
    protected int codigo_produto;
    protected String nome;
    protected double preco;
    
    public ProdutoPai(){
        this.codigo_produto = 0;
        this.nome = "";
        this.preco = 0.0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "ProdutoPai{" + "codigo_produto=" + codigo_produto + ", nome=" + nome + ", preco=" + preco + '}';
    }
}