package Serializadores;

import Classes.Quarto;
import java.util.ArrayList;
import java.util.List;

public class SerializadorQuarto {
    public String toCSV(List<Quarto> quartos) {
        String csv = "Numero;Tipo;Preco;\n";

        for (Quarto quarto : quartos) {
            csv += quarto.getNumeroQuarto() + ";"
                +quarto.getTipo() + ";"
                + quarto.getPrecoPorNoite() + ";\n";
        }
        return csv;
    }
    public List<Quarto> fromCSV(String data) {
        List<Quarto> quartos = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 3) {
                Quarto quarto = new Quarto();
                quarto.setNumeroQuarto(partes[0]);
                quarto.setTipo(partes[1]);
                quarto.setPrecoPorNoite(Double.parseDouble(partes[2]));
                
                //apos montar um produto, adiciono na lista
                quartos.add(quarto);
            }
        }
        return quartos;
    }
}