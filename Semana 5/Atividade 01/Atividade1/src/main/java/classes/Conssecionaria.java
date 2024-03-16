package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Conssecionaria {
    List<Carro> carro;
    
    public Conssecionaria(){
        carro = carro = new ArrayList<>();
    }
    
    public void Inserir(){
        Carro C1 = new Carro();
        C1.Preencher();
        carro.add(C1);
    }
    
    public void Remove(){
        
        if(carro.isEmpty()){
            System.out.println("Lista Vazia.");
        }else{
            Scanner ler = new Scanner(System.in);
            int index = 0;
            boolean Verifica = false;
            System.out.print("Me informe o indice para remover: ");

            do{
                index = ler.nextInt();
                if(index >= 0 && index < carro.size()){
                    Verifica = true;
                }else{
                    System.out.print("Index invalido.");
                }
            }while(Verifica);

            carro.remove(index);
        }
    }
    
    public void Imprimir(){
        if(carro.isEmpty()){
            System.out.println("Lista Vazia.");
        }else{
            for (int i = 0; i < carro.size(); i++) {
                Carro C1 = carro.get(i);
                System.out.println(C1.toString());
            }
        }
    }
}

