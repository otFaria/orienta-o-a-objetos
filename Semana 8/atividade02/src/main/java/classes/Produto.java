package classes;
public class Produto {
    
    private int id;
    private String nome;
    private Double preco;
    private Double custo;
    private String cor;

    public Produto() {
        this.id = 0;
        this.nome = "";
        this.preco = 0.0;
        this.custo = 0.0;
        this.cor = "";
    }

    public Produto(int id, String nome, Double preco, Double custo, String cor){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nID = " + id + ", Nome = " + nome + ", Preco = " + preco + ", Custo = " + custo + ", Cor = " + cor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
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
        final Produto other = (Produto) obj;
        return this.id == other.id;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Double getPreco(){
        return preco;
    }
    
    public Double getCusto(){
        return custo;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setId(int ID){
        this.id = ID;
    }
    
    public void setNome(String Nome){
        this.nome = Nome;
    }
    
    public void setPreco(Double Preco){
        this.preco = Preco;
    }
    
    public void setCusto(Double Custo){
        this.custo = Custo;
    }
    
    public void setCor(String Cor){
        this.cor = Cor;
    }  
}
