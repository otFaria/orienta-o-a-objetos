/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciadores;

import Classes.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class GerenciadorReserva {
    private List<Reserva> reservas = new ArrayList<>();

    public List<Reserva> getReservas() {
        return reservas;
    }
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    
    
}
