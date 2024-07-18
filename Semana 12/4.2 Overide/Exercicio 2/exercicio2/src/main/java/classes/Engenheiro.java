package Classes;

import java.util.Scanner;

public class Engenheiro extends Funcionario {
    private String areaDeEspecializacao;

    public Engenheiro() {
        super();
        this.areaDeEspecializacao = "";
    }

    public Engenheiro(String nome, int id, double salario, boolean emEstoque, String areaDeEspecializacao) {
        super(nome, id, salario, emEstoque);
        this.areaDeEspecializacao = areaDeEspecializacao;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("area de Especializacaso: ");
        this.areaDeEspecializacao = ler.nextLine();
    }

    @Override
    public void aumentarSalario() {
        this.salario += this.salario * 0.10; // Aumento de 10%
    }

    @Override
    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea de Especializaçao: " + this.areaDeEspecializacao;
    }

    public String getAreaDeEspecializacao() {
        return areaDeEspecializacao;
    }

    public void setAreaDeEspecializacao(String areaDeEspecializacao) {
        this.areaDeEspecializacao = areaDeEspecializacao;
    }
}
