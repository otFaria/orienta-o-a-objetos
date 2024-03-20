package classes;
import java.util.Scanner;

public class Carro {
    private String Fabricante;
    private int Ano;
    private String Cor;
    private int Potencia;
    private String Modelo;
    private Roda [] roda;
    
    
    public Carro(){
        this.Fabricante = " ";
        this.Cor = " ";
        this.Modelo = " ";
        this.Ano = 0;
        this.Potencia = 0;
        this.roda = new Roda[4];
        
       for(int i = 0; i < 4; i++){
           this.roda[i] = new Roda();
       }
    }

    public Carro(String Fabricante, int Ano, String Cor, int Potencia, Roda[] roda){
        this.Fabricante = Fabricante;
        this.Ano = Ano;
        this.Cor = Cor;
        this.Potencia = Potencia;
        this.roda = roda;
    }
    
    public Carro(Carro C1){
        this.Fabricante = C1.getFabricante();
        this.Ano = C1.getAno();
        this.Cor = C1.getCor();
        this.Potencia = C1.getPotencia();
        
        for(int i = 0; i < 4; i++){
            Roda r1 = C1.getRoda()[i];
            roda[i].Copia(r1);
        }
    }
    
    public void Preencher(){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("\n\nPreencha os dados do carro abaixo.");
        
        System.out.print("Fabricante: ");
        this.Fabricante = ler.next();
        
        System.out.print("\nAno: ");
        this.Ano = ler.nextInt();
        
        System.out.print("\nCor: ");
        this.Cor = ler.next();
        
        System.out.print("\nPotencia: ");
        this.Potencia = ler.nextInt();
        
        System.out.print("\nModelo: ");
        this.Modelo = ler.next();
        
        for (int i = 0; i < 4; i++) {
            System.out.print("\nRoda " + (i+1) + ": ");
            roda[i].Preencher();
        }
    }
    
    public void Imprimir(){
        
        System.out.println("\nFabricante: " + this.Fabricante);
        System.out.println("\nAno: " + this.Ano);
        System.out.println("\nCor: " + this.Cor );
        System.out.println("\nModelo: " + this.Modelo);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("\nRoda: " + (i+1));
            System.out.println(roda[i].toString());
        }
    }
    
    @Override
    public String toString(){
        String Texto = "\nFabricante: " + this.Fabricante + "\nAno: " + this.Ano + "\nCor: " + this.Cor + "\nModelo: " + this.Modelo;
        return Texto;
    }
    
    //Getters

    public String getFabricante() {
        return Fabricante;
    }
    
    public String getModelo(){
        return Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public String getCor() {
        return Cor;
    }

    public int getPotencia() {
        return Potencia;
    }

    public Roda[] getRoda() {
        return roda;
    }
    
    //Setters

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public void setRoda(Roda[] roda) {
        this.roda = roda;
    }
    
    
    
    
}
