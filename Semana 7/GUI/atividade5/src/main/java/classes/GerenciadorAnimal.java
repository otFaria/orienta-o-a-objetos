package classes;
import java.util.ArrayList;
import java.util.List;
public class GerenciadorAnimal {
    private List<Animal> animais;

    public GerenciadorAnimal(){
        animais = new ArrayList<>();
    }
    
    
    public Animal ProcurarAnimal(String ID){
        Animal A1 = new Animal();
        
        if(animais.isEmpty()){
            System.out.println("\nA lista de animais esta vazia.");
            return null;
            
        }else{
            for (int i = 0; i < animais.size(); i++) {
                if (animais.get(i).getid().equals(ID)){
                    A1 = animais.get(i);
                    return A1;
                }
            }
        }
        
        return null;
    }
    
    public void AdicionaAnimal(Animal A1){
        animais.add(A1);
    }
    
    public void RemoverAnimal(String ID){
        if (animais.isEmpty()) {
            System.out.println("\nLista Vazia.");
        }else{
            for (int i = 0; i < animais.size(); i++) {
                if (animais.get(i).getid().equalsIgnoreCase(ID)){
                    System.out.println("\nO Cachorro foi removido com sucesso.");
                    animais.remove(i);
                }
            }
        }
    }
    
    public void Imprimir(){
        System.out.println(toString());
    }
    
    public void Atualiza_Animal(String id , Animal novo){
        Animal animal_existente = ProcurarAnimal(id);
        
        if (animal_existente != null){
            int index = animais.indexOf(animal_existente);
            animais.set(index, novo);
            
            System.out.println("\nAnimal Atualizado com sucesso.");
        }else{
            System.out.println("Animal Nao encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Animais = " + this.animais;
    }
    
    public List<Animal> getAnimais(){
        return animais;
    }
    
}
