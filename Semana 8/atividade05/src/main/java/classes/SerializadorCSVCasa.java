package classes;

import java.util.ArrayList;
import java.util.List;

public class SerializadorCSVCasa {
    
    public String toCSV(List<Casa> casas){
        
        String csv = "ID;Tipo;Quartos;Banheiros;Aréa;Preço;\n";
        
        for (Casa  casa : casas) {
            csv += casa.getId() + ";"
                +  casa.getTipo() + ";"
                +  casa.getQuartos() + ";"
                +  casa.getBanheiros() + ";"
                +  casa.getArea() + ";"
                +  casa.getPreco() + ";\n";
                }
        
        return csv;
    }
    
    public List<Casa> fromCsv(String csv){
        
        List<Casa> casas = new ArrayList<>();
        Casa C1;
        
        String[] linhas = csv.split("\n");
        
        for (int i = 1; i < linhas.length; i++){
            C1 = new Casa();
            String[] atributos = linhas[i].split(";");
            if (atributos.length >= 6) {
                C1.setId(Integer.parseInt(atributos[0]));
                C1.setTipo(atributos[1]);
                C1.setQuartos(Integer.parseInt(atributos[2]));
                C1.setBanheiros(Integer.parseInt(atributos[3]));
                C1.setArea(Integer.parseInt(atributos[4]));
                C1.setPreco(Double.parseDouble(atributos[5]));
                casas.add(C1);
            }
        }
        return casas;
    }
}