package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Secretario extends Funcionario {
    private List<String> linguasFaladas;

    public Secretario() {
        super();
        this.linguasFaladas = Arrays.asList("");
    }

    public Secretario(String nome, int id, double salario, boolean emEstoque, List<String> linguasFaladas) {
        super(nome, id, salario, emEstoque);
        this.linguasFaladas = linguasFaladas;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("Línguas Faladas (separadas por vírgula): ");
        this.linguasFaladas = Arrays.asList(ler.nextLine().split(","));
    }

    public void organizarAgenda() {
        System.out.println("Agenda organizada para o dia!");
    }

    @Override
    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nLínguas Faladas: " + this.linguasFaladas;
    }

    public List<String> getLinguasFaladas() {
        return linguasFaladas;
    }

    public void setLinguasFaladas(List<String> linguasFaladas) {
        this.linguasFaladas = linguasFaladas;
    }
}
