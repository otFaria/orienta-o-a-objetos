package Serializadores;

import Classes.Hospede;
import java.util.ArrayList;
import java.util.List;

public class SerializadorHospede {
    public String toCSV(List<Hospede> hospedes) {
        String csv = "Nome;Identidade;Numero;Endereço\n";

        for (Hospede hospede : hospedes) {
            csv += hospede.getNome()  + ";"
                +hospede.getDocumentoIdentidade()+ ";"
                + hospede.getContato() + ";"
                + hospede.getEndereco()+"\n";
        }
        return csv;
    }
    public List<Hospede> fromCSV(String data) {
        List<Hospede> hospedes = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Hospede hospede = new Hospede();
                hospede.setNome(partes[0]);
                hospede.setDocumentoIdentidade(partes[1]);
                hospede.setContato((partes[2]));
                hospede.setEndereco(partes[3]);
                
                //apos montar um produto, adiciono na lista
                hospedes.add(hospede);
            }
        }
        return hospedes;
    }
}
