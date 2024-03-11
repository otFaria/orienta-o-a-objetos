package classe;
import classe.ControleEstoque;
import java.util.Scanner;
public class Menu {
    
    public static void Menu(){
        
        System.out.println("--------------------------------------");
        
        System.out.println("Bem vindo ao menu.");
        
        System.out.println("\nSelecione as opcoes abaixo.");
        
        System.out.print("\n1 - Inserir produto na lista.");
        System.out.print("\n2 - Remover produto da lista.");
        System.out.print("\n3 - Pesquisar produto na lista.");
        System.out.print("\n4 - Imprimir lista de produtos.");
        System.out.print("\n5 - Atualizar quantidade no estoque.");
        System.out.print("\n0 - Sair.");
        System.out.println("\n--------------------------------------");
        
        System.out.print("\nInforme a opcao: ");
    } 
    
    public static void Implementacao(){
        Scanner ler = new Scanner(System.in);
        ControleEstoque Gerencia = new ControleEstoque();
        int opcao = 0;
        
        do{
            System.out.println("");
            Menu();
            opcao = ler.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo");
                    break;
                case 1:
                    Produto L1 = new Produto();
                    L1.Fill();
                    Gerencia.adicionarProduto(L1);
                    break;
                case 2:
                    String Codigo = " ";
                    System.out.print("Me informe o codigo do produto: ");
                    Codigo = ler.next();
                    Gerencia.removerProduto(Codigo);
                    break;
                case 3:
                    String Codigo3 = " ";
                    System.out.print("Me informe o codigo do produto: ");
                    Codigo3 = ler.next();
                    Gerencia.buscarProduto(Codigo3);
                    break;
                case 4:
                    Gerencia.listarProdutos();
                    break;
                case 5:
                    
                    String Codigo2 = " ";
                    int Quant = 0;
                    
                    System.out.print("Me informe o codigo do produto: ");
                    Codigo = ler.next();
                    System.out.print("Me informe a quantidade para ser atualizada: ");
                    Quant = ler.nextInt();
                    Gerencia.atualizarQuantidade(Codigo, Quant);
                default:
                    System.out.println("\nOpcao invalida.\n");
            }
        }while(opcao != 0);
    }
}
