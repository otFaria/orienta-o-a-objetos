package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenteCarro {
    
    private List<Carro> carros;

    public GerenteCarro() {
        carros = new ArrayList<>();
    }

    public GerenteCarro(List<Carro> carros) {
        this.carros = carros;
    }
    
    public void AdicionarCarro(Carro C1){
        this.carros.add(C1);
    }
    
    public void Excluir_Carro(int id){
    
        Carro C1 = Buscar_Carro(id);
        
        if (C1 != null){
            carros.remove(C1);
            System.out.println("Carro removido com sucesso.");
        }else{
            System.out.println("Carro não localizado.");
        }
    }
    
    public void Atualizar_Carro(int id, Carro carro_novo){
        Carro C1 = Buscar_Carro(id);
        
        if (C1 != null) {
            int index = carros.indexOf(C1);
            carros.set(index, carro_novo);
            System.out.println("Carro Atualizado com sucesso.");
        }else{
            System.out.println("ID invalido.");
        }
    }
    
    public Carro Buscar_Carro(int id){
        
        Carro C1;
        
        for (Carro carro : carros) {
            if (carro.getId() == id)
                return carro;
        }
        
        return null;
    }
    
    public void SaveToFile(String path) throws IOException{
        SerializadorCSVCarros serializador = new SerializadorCSVCarros();
        String csv = serializador.toCsv(carros);
        
        FilePersistence filePe = new FilePersistence();
        filePe.SaveToFile(path, csv);
    }
    
    public void LoadFromFile(String path) throws FileNotFoundException{
        
        FilePersistence filePe = new FilePersistence();
        String csv = filePe.LoadFromFile(path);
        
        SerializadorCSVCarros serializador = new SerializadorCSVCarros();
        this.carros = serializador.FromCsv(csv);
    }

    @Override
    public String toString() {
        return "Carros = " + carros;
    }
}

