package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAnimal {
    
    private List<Animal> animais;

    public GerenciadorAnimal() {
        animais = new ArrayList<>();
    }

    public GerenciadorAnimal(List<Animal> animais) {
        this.animais = animais;
    }
    
    public void SalvarAnimal(Animal A1){
        this.animais.add(A1);
    }
    
    public void Excluir_Animal(int cod){
        Animal A1 = BuscarAnimal(cod);
        
        if (A1 != null){
            this.animais.remove(A1);
            System.out.println("Animal removido com sucesso.");
        }else
            System.out.println("Animal não encontrado.");
    }
    
    public void Atualiza_Animal(int cod, Animal animal_novo){
        Animal A1 = BuscarAnimal(cod);
        
        if (A1 != null){
            int index = animais.indexOf(A1);
            animais.set(index, animal_novo);
        }
    }
    
    public Animal BuscarAnimal(int cod){
        
        for (Animal animal : animais) {
            if (animal.getCod() == cod) {
                return animal;
            }
        }
        return null;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    @Override
    public String toString() {
        return "Animais = " + animais + "\n";
    }
    
    public void SaveToFile(String path) throws IOException{
        
        SerializadorCSVAnimal serializador = new SerializadorCSVAnimal();
        String csv = serializador.toCSV(animais);
        
        FilePersistence filePe = new FilePersistence();
        filePe.SaveToFile(path, csv);
    }
    
    public void LoadFormFile(String path) throws FileNotFoundException{
        
        FilePersistence filePe = new FilePersistence();
        String csv = filePe.LoadFromFile(path);
                   
        SerializadorCSVAnimal serializador = new SerializadorCSVAnimal();
        animais = serializador.FromCsv(csv);
    }
}