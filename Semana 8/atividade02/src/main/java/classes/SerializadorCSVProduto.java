package classes;

import java.util.ArrayList;
import java.util.List;

public class SerializadorCSVProduto{
    
    //To csv
    
    public String toCSV(List<Produto> produtos){
        
        String csv = "ID;Nome;Preço;Custo;Cor;\n";
        
        for (Produto produto : produtos) {
            csv += produto.getId() + ";"
                + produto.getNome() + ";"
                + produto.getPreco() + ";"
                + produto.getCusto() + ";"
                + produto.getCor() + ";\n";
        }
        
        return csv;
    }
    
    //FromCSV
    
    public List<Produto> FromCsv(String csv){
        
        List<Produto> produtos = new ArrayList<>();
        
        String[] linhas = csv.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            Produto P1 = new Produto();
            String[] atributos = linhas[i].split(";");
            
            if (atributos.length >= 5) {
                P1.setId(Integer.parseInt(atributos[0]));
                P1.setNome(atributos[1]);
                P1.setPreco(Double.parseDouble(atributos[2]));
                P1.setCusto(Double.parseDouble(atributos[3]));
                P1.setCor(atributos[4]);
                produtos.add(P1);
            }
        }
        return produtos;
    }
}
