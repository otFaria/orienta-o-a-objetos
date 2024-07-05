/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class FilePersistence {
    public void saveToFile(String texto, String filePath) throws IOException {        
        try (FileWriter arq = new FileWriter(filePath)) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(texto);
            gravarArq.close();
        }        
    }

    public String loadFromFile(String filePath) throws FileNotFoundException {
        String conteudoLido = "";
        
        //cria o objeto arquivo
        File file = new File(filePath);
        //cria o scanner que vai ler o arquivo
        Scanner scanner = new Scanner(file);

        //efetua a litura linha por linha, copiando do arquivo para uma string 'ConteudoLido'
        scanner.useDelimiter("\\Z"); // ler até o final da linha
        while (scanner.hasNext()) {
            conteudoLido += scanner.next();
        }
        
        return conteudoLido;
    }
}
