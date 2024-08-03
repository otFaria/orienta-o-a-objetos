package classes;
public class Eletronico extends ProdutoPai implements Produto{
    
    public Eletronico(){
        super();
    }
    
    public void Preencher(Eletronico E1){
        this.codigo_produto = E1.getCodigo_produto();
        this.nome = E1.getNome();
        this.preco = E1.getPreco();
    }
    
    @Override
    public void calculaDesconto(double calcula_desconto){
        if (this.preco >= calcula_desconto) {
            this.preco = this.preco - calcula_desconto;
            System.out.println("Desconto aplicado com sucesso, o valor do Eletronico é " + this.preco + ".");
        }else{
            System.out.println("O valor do eletronico é menor que o desconto.");
        }
    }
}