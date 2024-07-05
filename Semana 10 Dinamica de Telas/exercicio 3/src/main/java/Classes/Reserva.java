/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author USUARIO
 */
public class Reserva {
    private String numIdentidade;
    private String numeroQuarto;
    private String chekinData;
    private String chekoutData;

    public String getNumIdentidade() {
        return numIdentidade;
    }

    public void setNumIdentidade(String numIdentidade) {
        this.numIdentidade = numIdentidade;
    }

    

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getChekinData() {
        return chekinData;
    }

    public void setChekinData(String chekinData) {
        this.chekinData = chekinData;
    }

    public String getChekoutData() {
        return chekoutData;
    }

    public void setChekoutData(String chekoutData) {
        this.chekoutData = chekoutData;
    }

    @Override
    public String toString() {
        return "Reserva{" + "Identidade=" + numIdentidade + ", numeroQuarto=" + numeroQuarto + ", chekinData=" + chekinData + ", chekoutData=" + chekoutData + '}';
    }
    
    
    
    
}
