package Classes;

import java.util.Scanner;

public class Perecivel extends Produto {
    
    private double peso;
    
    public Perecivel() {
        super();
        this.peso = 0.0;
    }
    
    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nPreencha os dados do produto abaixo.");
        super.Preencher();
        
        System.out.print("\nPeso (em kg): ");
        this.peso = ler.nextDouble();
    }
    
    @Override
    public void Imprimir() {
        System.out.println("\nOs dados do produto perecível estão exibidos abaixo: \n");
        
        super.Imprimir();
        System.out.println("Peso: " + this.peso + " kg");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
