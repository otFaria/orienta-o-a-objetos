package Classes;

import java.util.Scanner;

public class Engenheiro extends Funcionario {
    private String especializacao;

    public Engenheiro() {
        super();
        this.especializacao = "";
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        
        System.out.print("\nEspecialização: ");
        this.especializacao = ler.nextLine();
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Especialização: " + this.especializacao);
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
