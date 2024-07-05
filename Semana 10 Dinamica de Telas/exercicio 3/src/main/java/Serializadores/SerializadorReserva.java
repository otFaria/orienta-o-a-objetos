package Serializadores;

import Classes.Reserva;
import java.util.ArrayList;
import java.util.List;

public class SerializadorReserva {
    public String toCSV(List<Reserva> reservas) {
        String csv = "Numero identidade;Numero do quarto;Checkin;Checkout\n";

        for (Reserva reserva : reservas) {
            csv += reserva.getNumIdentidade()+ ";"
                +reserva.getNumeroQuarto()+ ";"
                +reserva.getChekinData()+ ";"
                +reserva.getChekoutData()+"\n";
        }
        return csv;
    }
    public List<Reserva> fromCSV(String data) {
        List<Reserva> reservas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Reserva reserva = new Reserva();
                reserva.setNumIdentidade(partes[0]);
                reserva.setNumeroQuarto(partes[1]);
                reserva.setChekinData(partes[2]);
                reserva.setChekoutData(partes[3]);
                //apos montar um produto, adiciono na lista
                reservas.add(reserva);
            }
        }
        return reservas;
    }
}
