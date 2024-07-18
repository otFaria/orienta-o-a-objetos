package Classes;

import java.util.Scanner;

public class Secretario extends Funcionario {
    private int ramal;

    public Secretario() {
        super();
        this.ramal = 0;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        
        System.out.print("\nRamal: ");
        this.ramal = ler.nextInt();
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Ramal: " + this.ramal);
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
