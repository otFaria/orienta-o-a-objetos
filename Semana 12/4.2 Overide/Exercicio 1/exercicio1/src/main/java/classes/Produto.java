package Classes;

public class Produto {
    protected int codigo;
    protected String nome;
    protected double preco;
    protected double custo;
    protected int estoque;

    public Produto(int codigo, String nome, double preco, double custo, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
        this.estoque = estoque;
    }

    // 3% de desconto
    public double calcularDesconto(double percentual) {
        return preco * (1 - percentual / 100) * 0.97; 
    }

    // 10% do custo base como custo adicional padrão
    public double calcularCustoAdicional() {
        return custo * 0.10; 
    }

    public boolean verificarEstoque(){
        return estoque > 0;
    }

    public void imprimirDetalhes() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String Produto = "Codigo: " + codigo + "\nNome: " + nome + "\nPreço: " + preco + "\nCusto: " + custo + "\nEstoque: " + estoque;
        return Produto;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
