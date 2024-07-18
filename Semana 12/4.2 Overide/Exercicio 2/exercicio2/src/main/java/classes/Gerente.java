package Classes;

import java.util.Scanner;

public class Gerente extends Funcionario {
    private int equipeSize;

    public Gerente() {
        super();
        this.equipeSize = 0;
    }

    public Gerente(String nome, int id, double salario, boolean emEstoque, int equipeSize) {
        super(nome, id, salario, emEstoque);
        this.equipeSize = equipeSize;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("Tamanho da Equipe: ");
        this.equipeSize = ler.nextInt();
    }

    @Override
    public void aumentarSalario() {
        double aumento = 0.05 + (0.005 * this.equipeSize); // 5% + 0,5% por membro da equipe
        this.salario += this.salario * aumento;
    }

    @Override
    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTamanho da Equipe: " + this.equipeSize;
    }

   
    public int getEquipeSize() {
        return equipeSize;
    }

    public void setEquipeSize(int equipeSize) {
        this.equipeSize = equipeSize;
    }
}
