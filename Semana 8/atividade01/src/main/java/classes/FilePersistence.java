package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class FilePersistence {
    
    public void saveToFile(String path , String csv) throws IOException{
        
        FileWriter arq = new FileWriter(path);
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.print(csv);
        
        arq.close();
    }
    
    public String loadToFile(String path) throws FileNotFoundException{
        
        File f = new File(path);
        Scanner arquivoLido = new Scanner(f);
      
        arquivoLido.useDelimiter("\\Z");
        String linhaLida = "";
        
        while(arquivoLido.hasNext()){
            linhaLida += arquivoLido.next();
        }
        
        arquivoLido.close();
        
        return linhaLida;
    }
}
