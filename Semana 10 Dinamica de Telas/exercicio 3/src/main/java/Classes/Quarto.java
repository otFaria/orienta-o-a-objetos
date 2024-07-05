/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author USUARIO
 */
public class Quarto {
    // Atributos
    private String numeroQuarto;
    private String tipo;
    private double precoPorNoite;

    // Construtor
    
    public Quarto() {
    }

    public Quarto(String numeroQuarto, String tipo, double precoPorNoite) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
    }

    // Métodos getters e setters
    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    // Método toString para representação textual do objeto
    @Override
    public String toString() {
        return "Quarto{" +
                "numeroQuarto=" + numeroQuarto +
                ", tipo='" + tipo + '\'' +
                ", precoPorNoite=" + precoPorNoite +
                '}';
    }
}
