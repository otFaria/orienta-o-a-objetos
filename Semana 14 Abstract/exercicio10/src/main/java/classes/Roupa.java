package classes;
public class Roupa extends ProdutoPai implements Produto{

    public Roupa() {
        this. preco = 0.0;
        this.nome = "";
        this.codigo_produto = 0;
    }
    
    public Roupa(Roupa R1) {
        this. preco = R1.getPreco();
        this.nome = R1.getNome();
        this.codigo_produto = R1.getCodigo_produto();
    }

    @Override
    public void calculaDesconto(double valor_desconto) {
        if (this.preco >= valor_desconto) {
            this.preco = preco - valor_desconto;
            System.out.println("Desconto aplicado com sucesso, o valor da roupa é " + this.preco + ".");
        }else{
            System.out.println("O valor da roupa é menor que o desconto.");
        }
    }
    
    
    
}
