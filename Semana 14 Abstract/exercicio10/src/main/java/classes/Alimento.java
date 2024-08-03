package classes;
public class Alimento extends ProdutoPai implements Produto{
    
    public Alimento(){
        super();
    }
    
    public Alimento(Alimento A1){
        this.nome = A1.getNome();
        this.codigo_produto = A1.getCodigo_produto();
        this.preco = A1.getPreco();
    }
    
    @Override
    public void calculaDesconto(double calcula_desconto){
        if (this.preco >= calcula_desconto) {
            this.preco = this.preco - calcula_desconto;
            System.out.println("Desconto aplicado com sucesso, o valor do Alimento é " + this.preco + ".");
        }else{
            System.out.println("O valor do alimento é menor que o desconto.");
        }
    }
}