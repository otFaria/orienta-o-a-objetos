package classes;

import java.util.Scanner;

public class Roda {
    
    private double PesoMax;
    private String Modelo;
    private int Aro;
    private String Material;
    
    public Roda(){
        this.PesoMax = 0.0;
        this.Modelo = " ";
        this.Aro = 0;
        this.Material = " ";
    }

    public Roda(double PesoMax, String Modelo, int Aro, String Material) {
        this.PesoMax = PesoMax;
        this.Modelo = Modelo;
        this.Aro = Aro;
        this.Material = Material;
    }
    
    public Roda(Roda R1){
        this.PesoMax = R1.getPesoMax();
        this.Modelo = R1.getModelo();
        this.Material = R1.getMaterial();
        this.Aro = R1.getAro();
    }
    
    public void Preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n\nPreencha os dados abaixo da roda.");
        
        System.out.print("\nModelo: ");
        this.Modelo = ler.next();
        
        System.out.print("\nMaterial: ");
        this.Material = ler.next();
        
        System.out.print("\nAro: ");
        this.Aro = ler.nextInt();
        
        System.out.print("\nPeso Maximo: ");
        this.PesoMax = ler.nextDouble(); 
    }
    
    public void Copia(Roda R1){
        this.PesoMax = R1.getPesoMax();
        this.Modelo = R1.getModelo();
        this.Material = R1.getMaterial();
        this.Aro = R1.getAro();
    }
    
    @Override
    public String toString(){
        String Texto = "\nModelo: " + this.Modelo + "\nMaterial: " + this.Material + "\nAro: " + this.Aro + "\nPeso Maximo: " + this.PesoMax;
        return Texto;
    }
    
    //Getters

    public double getPesoMax() {
        return PesoMax;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAro() {
        return Aro;
    }

    public String getMaterial() {
        return Material;
    }
    
    //Setters

    public void setPesoMax(double PesoMax) {
        this.PesoMax = PesoMax;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAro(int Aro) {
        this.Aro = Aro;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
    
    
    
    
}
