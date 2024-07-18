package Classes;

import java.util.Scanner;

public class Gerente extends Funcionario {
    private int numSubordinados;

    public Gerente() {
        super();
        this.numSubordinados = 0;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        
        System.out.print("\nNúmero de Subordinados: ");
        this.numSubordinados = ler.nextInt();
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Número de Subordinados: " + this.numSubordinados);
    }

    // Getters and Setters
    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }
}
