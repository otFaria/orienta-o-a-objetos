package Classes;

import java.util.Scanner;

public class Movel extends Produto {
    
    private String cor;
    
    public Movel() {
        super();
        this.cor = "";
    }
    
    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nPreencha os dados do produto abaixo.");
        super.Preencher();
        
        System.out.print("\nCor: ");
        this.cor = ler.nextLine();
    }
    
    @Override
    public void Imprimir() {
        System.out.println("\nOs dados do produto móvel estão exibidos abaixo: \n");
        
        super.Imprimir();
        System.out.println("Cor: " + this.cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
