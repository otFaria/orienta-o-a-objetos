package classes;
import Interfaces.ILogStorage;
import java.io.IOException;
public class ConsoleLogStorage implements ILogStorage{
    
   @Override 
   public void Armazenar(String Mensagem){
       System.out.println("\nA Menssagem de log é: " + Mensagem);
   }
}
