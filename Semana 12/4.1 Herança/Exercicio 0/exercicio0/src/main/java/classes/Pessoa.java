package Classes;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected char sexo;
    protected int idade;

    public Pessoa() {
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
    }

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = ler.nextLine();
        System.out.print("Sexo (M/F): ");
        this.sexo = ler.next().charAt(0);
        System.out.print("Idade: ");
        this.idade = ler.nextInt();
    }

    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String Pessoa = "Nome: " + this.nome + "\nSexo: " + this.sexo + "\nIdade: " + this.idade;
        return Pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
