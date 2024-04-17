package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GerenciadorCasa {
    private List<Casa> casas;

    public GerenciadorCasa() {
        casas = new ArrayList<>();
    }

    public GerenciadorCasa(List<Casa> casas) {
        this.casas = casas;
    }
    
    public void AdicionarCasa(Casa C1){
        this.casas.add(C1);
    }
    
    public void Remover_Casa(int id){
        Casa C1 = Buscar_Casa(id);
        
        if (C1 != null) {
            this.casas.remove(C1);
            System.out.println("Removida com sucesso.");
        }else{
            System.out.println("ID não localizado.");
        }
    }
    
    public void Atualizar_Casa(int id , Casa casa_nova){
        Casa C1 = Buscar_Casa(id);
        
        if (C1 != null) {
            int index = casas.indexOf(C1);
            casas.set(index, casa_nova);
        }else{
            System.out.println("ID não localizado.");
        }
    }
    
    public Casa Buscar_Casa(int id){
        
        for (Casa casa : casas) {
            if (casa.getId() == id) {
                return casa;
            }
        }
        
        return null;
    }
    
    public void SaveToFile(String path) throws IOException{
        
        SerializadorCSVCasa serializador = new SerializadorCSVCasa();
        String csv = serializador.toCSV(casas);
        
        FilePersistence filePe = new FilePersistence();
        filePe.SaveToFile(path, csv);
    }
    
    public void LoadFromFile(String path) throws FileNotFoundException{
        
        FilePersistence filePe = new FilePersistence();
        String csv = filePe.LoadFromFile(path);
        
        SerializadorCSVCasa serializador = new SerializadorCSVCasa();
        this.casas = serializador.fromCsv(csv);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.casas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GerenciadorCasa other = (GerenciadorCasa) obj;
        return Objects.equals(this.casas, other.casas);
    }

    @Override
    public String toString() {
        return "Casas = " + casas;
    }
}