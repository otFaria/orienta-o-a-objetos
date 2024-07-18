package Classes;
import java.util.Scanner;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected String departamento;

    public Funcionario() {
        this.nome = "";
        this.idade = 0;
        this.departamento = "";
    }

    public Funcionario(String nome, int idade, String departamento) {
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
    }

    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("\nNome: ");
        this.nome = ler.nextLine();
        
        System.out.print("\nIdade: ");
        this.idade = ler.nextInt();
        
        System.out.print("\nDepartamento: ");
        this.departamento = ler.next();
    }

    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String Funcionario = "Nome: " + this.nome + "\nIdade: " + this.idade + "\nDepartamento: " + this.departamento;
        return Funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
