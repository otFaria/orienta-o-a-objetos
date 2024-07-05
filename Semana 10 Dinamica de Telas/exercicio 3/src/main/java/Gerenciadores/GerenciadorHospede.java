/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciadores;

import Classes.Hospede;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class GerenciadorHospede {
    private List<Hospede> hospedes;

    public GerenciadorHospede() {
        hospedes = new ArrayList<>();
    }
    
    
    
    public void addHospede(Hospede hospede){
        hospedes.add(hospede);
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(List<Hospede> hospedes) {
        this.hospedes = hospedes;
    }
    
}
