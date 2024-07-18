package Classes;

import java.util.Scanner;

public class Professor extends Pessoa {
    private String cpf;

    public Professor() {
        super();
        this.cpf = "";
    }

    public Professor(String nome, char sexo, int idade, String cpf) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("CPF: ");
        this.cpf = ler.next();
    }

    @Override
    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + this.cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
