package classes;

import java.util.ArrayList;
import java.util.List;

public class SerializadorCSVCarros {
    
    public String toCsv(List<Carro> carros){
        
        String csv = "ID;Marca;Modelo;Ano;Preço;\n";
        
        for (Carro carro : carros) {
            csv += carro.getId() + ";"
                + carro.getMarca() + ";"
                + carro.getModelo() + ";"
                + carro.getAno() + ";"
                + carro.getPreco() + ";\n";
        }
        
       return csv;
    }
    
    public List<Carro> FromCsv(String csv){
        List<Carro> carros = new ArrayList<>();
        Carro C1;
        
        String[] linhas = csv.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            
            C1 = new Carro();
            String[] atributos = linhas[i].split(";");
            
            if (atributos.length >= 5){
        
                C1.setId(Integer.parseInt(atributos[0]));
                C1.setMarca(atributos[1]);
                C1.setModelo(atributos[2]);
                C1.setAno(Integer.parseInt(atributos[3]));
                C1.setPreco(Double.parseDouble(atributos[4]));
                
                carros.add(C1);
            }
        }
        return carros;
    }
}