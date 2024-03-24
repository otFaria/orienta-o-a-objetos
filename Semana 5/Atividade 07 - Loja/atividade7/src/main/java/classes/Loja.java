
package classes;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Pedido> pedidos;

    public Loja() {
        this.pedidos = new ArrayList<>();
    }
    
    public int numeroDePedidos(){
        int QuantidadePedidos = 0;
        for(Pedido P1 : pedidos){
            QuantidadePedidos++;
        }
        return QuantidadePedidos;
    }
    public double valorTotal(){
        
        double ValorTotal = 0.0;
        for(Pedido P1 : pedidos){
            ValorTotal = ValorTotal + P1.valorTotal();
        }
        
        return ValorTotal;
    }
}
