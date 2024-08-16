package classes;
import Interfaces.ILogStorage;
import java.io.IOException;

public class ArquivoLogStorage implements ILogStorage{
   
   @Override 
   public void Armazenar(String Mensagem){
        FilePersistence F1 = new FilePersistence();
      
       try {
           F1.SaveToFile(Mensagem, "Log.txt");
       } catch (IOException ex) {
           System.out.println("Erro ao armazenar no arquivo: " + ex.getMessage());
       }
   }
}