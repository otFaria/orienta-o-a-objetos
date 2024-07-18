package Classes;

import java.util.Scanner;

public class Aluno extends Pessoa {
    private String matricula;
    private int anoIngresso;

    public Aluno() {
        super();
        this.matricula = "";
        this.anoIngresso = 0;
    }

    public Aluno(String nome, char sexo, int idade, String matricula, int anoIngresso) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("Matrícula: ");
        this.matricula = ler.next();
        System.out.print("Ano de Ingresso: ");
        this.anoIngresso = ler.nextInt();
    }

    @Override
    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.matricula + "\nAno de Ingresso: " + this.anoIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
