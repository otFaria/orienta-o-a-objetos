package Classes;

import java.util.Scanner;

public class Diretor extends Funcionario {
    private double bonus;

    public Diretor() {
        super();
        this.bonus = 0.0;
    }
    
    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        
        System.out.print("\nBônus: ");
        this.bonus = ler.nextDouble();
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Bônus: " + this.bonus);
    }

    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
