package classes;

import java.util.Scanner;

public class Menu {
    
    public static void Menu(){
        System.out.println("n\nBem vindo ao menu Conssecionaria Oeste");
        System.out.println("Selecione alguma opção abixo.");
        
        System.out.println("1- Inserir carros na lista.");
        System.out.println("2- Remover carros na lista.");
        System.out.println("3- Imprimir carros na lista.");
        System.out.println("0- Sair carros na lista.");
        System.out.println("Selecione a opção desejada.");
        
        System.out.print("Opção: ");
    }
    
    public static void implementacao(){
        Scanner ler = new Scanner (System.in);
        Conssecionaria C1 = new Conssecionaria();
        int opcao = 0;
        
        do{
            
            Menu();
            
            switch(opcao){
                
                case 1:
                    C1.Inserir();
                    break;

                case 2:
                    C1.Remove();
                    break;

                case 3:
                    C1.Imprimir();
                    break;

                case 0:
                    System.out.println("\nSaindo...\n\n");
                    break;

                default:
                    System.out.println("\nOpcao invalida.\n");
            }
        }while(opcao == 0);
    }
}

