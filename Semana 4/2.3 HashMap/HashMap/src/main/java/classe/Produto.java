
package classe;
import java.util.HashMap;
import java.util.Scanner;

public class Produto {
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;

    // Construtores, getters e setters

    public Produto() {
        this.codigo = " ";
        this.nome = " ";
        this.quantidadeEmEstoque = 0;
    }
    
    public Produto(String codigo, String nome, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    public Produto(Produto P1){
        this.codigo = P1.getCodigo();
        this.nome = P1.getNome();
        this.quantidadeEmEstoque = P1.getQuantidadeEmEstoque();
    }
    
    public void Fill(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("\n\nPrencha os dados abaixo.");
        
        System.out.print("\n\nCodigo: ");
        this.codigo = ler.next();
        System.out.print("\nNome do produto: ");
        this.nome = ler.next();
        System.out.print("\nQuantidade Em Estoque: ");
        this.quantidadeEmEstoque = ler.nextInt();
    }

    @Override
    public String toString(){
        String Texto = "Codigo = " + codigo + "\nNome = " + nome + "\nQuantidadeEmEstoque = " + quantidadeEmEstoque;
        return Texto;
    }

    //Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}