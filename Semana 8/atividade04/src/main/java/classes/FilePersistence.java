package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePersistence {
    
    public void SaveToFile(String path, String csv) throws IOException{
        
        FileWriter arq = new FileWriter(path);
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.print(csv);
        
        arq.close();
    }
    
    public String LoadFromFile(String path) throws FileNotFoundException{
        
        File f = new File(path);
        Scanner arquivoLido = new Scanner (f);
        
        arquivoLido.useDelimiter("\\Z");
        
        String linhaLida = "";
        
        while (arquivoLido.hasNext()) {            
            linhaLida += arquivoLido.next();
        }
        
        arquivoLido.close();
        
        return linhaLida;
    }
}