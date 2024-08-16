package classes;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FilePersistence {

    //SaveToFile
    
    public void SaveToFile(String mensagem, String path) throws IOException{
        
        FileWriter arq = new FileWriter(path);
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.print(mensagem);
        
        arq.close();
    }
}