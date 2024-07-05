/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciadores;

import Classes.Quarto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class GerenciadorQuarto {
    private List<Quarto> quartos;

    public GerenciadorQuarto() {
        quartos = new ArrayList<>();
    }
    public void addQuarto(Quarto quarto){
        quartos.add(quarto);
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }
    
}
