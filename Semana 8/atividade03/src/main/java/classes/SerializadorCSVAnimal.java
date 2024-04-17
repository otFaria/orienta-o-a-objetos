package classes;

import java.util.ArrayList;
import java.util.List;

public class SerializadorCSVAnimal {
   
    //ToCsv
    
    public String toCSV(List<Animal> animais){
        
        String csv = "Cod;Especie;Raça;Idade;Peso;\n";
        
        for (Animal animal : animais){
            csv +=  animal.getCod() + ";"
                    + animal.getEspecie() + ";"
                    + animal.getRaca() + ";"
                    + animal.getIdade() + ";"
                    + animal.getPeso() + ";\n";
        }
        
        return csv;
    }
    
    //FromCsv
    
    public List<Animal> FromCsv(String csv){
        
        List<Animal> animais = new ArrayList<>();
        
        String[] linhas = csv.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            
            Animal A1 = new Animal();
            String[] atributos = linhas[i].split(";");
            
            if(atributos.length >= 5){
                A1.setCod(Integer.parseInt(atributos[0]));
                A1.setEspecie(atributos[1]);
                A1.setRaca(atributos[2]);
                A1.setIdade(Integer.parseInt(atributos[3]));
                A1.setPeso(Double.parseDouble(atributos[4]));
                animais.add(A1);
            }
        }
        return animais;
    }
    
}
