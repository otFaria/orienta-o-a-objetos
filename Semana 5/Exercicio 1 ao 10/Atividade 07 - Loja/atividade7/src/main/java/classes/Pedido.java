package classes;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private String Codigo;
    private Cliente Cliente;
    private List<Produto> compra = new ArrayList<>();
    
    public void addProduto(Produto produto){
        compra.add(produto);
    }
    public void removerProduto(String nome){
        for(Produto P1 :compra){
            if(P1.getNome().equals(nome)){
                compra.remove(P1);
            }
        }
    }
    public double valorTotal(){
        double Soma = 0.0;
        for(Produto P1 : compra){
            Soma = Soma + P1.getPreco();
        }
        return Soma;
    }
    
}
