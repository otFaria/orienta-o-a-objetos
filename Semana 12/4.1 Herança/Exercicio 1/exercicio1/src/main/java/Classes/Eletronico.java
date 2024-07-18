package Classes;

import java.util.Scanner;

public class Eletronico extends Produto{
    
    private int voltagem;
    
    
    public Eletronico(){
        super();
        this.voltagem = 0;
    }
    
    @Override
    public void Preencher(){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("\nPreencha os dados do produto abaixo.");
        super.Preencher();
        
        System.out.print("\nVoltagem: ");
        this.voltagem = ler.nextInt();
    }
    
    @Override
    public void Imprimir(){
        System.out.println("\nOs dados do produto eletronico estão exibidos abaixo: \n");
        
        super.Imprimir();
        System.out.println("Voltagem: " + this.voltagem);
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}