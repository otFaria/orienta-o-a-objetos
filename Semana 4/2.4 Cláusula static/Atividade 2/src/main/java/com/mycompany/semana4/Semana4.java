package com.mycompany.semana4;
import classes.GerenciamentoDeLivros;
import classes.Livro;
import java.util.Scanner;
public class Semana4 {
     
    public static void Menu(){
        
        System.out.println("--------------------------------------");
        
        System.out.println("Bem vindo ao menu.");
        
        System.out.println("\nSelecione as opcoes abaixo.");
        
        System.out.print("\n1 - Inserir livro na lista.");
        System.out.print("\n2 - remover livro da lista.");
        System.out.print("\n3 - pesquisar livro na lista.");
        System.out.print("\n4 - imprimir livro na lista.");
        System.out.print("\n5 - Atualizar nome biblioteca.");
        System.out.print("\n0 - Sair.");
        System.out.println("\n--------------------------------------");
        
        System.out.print("\nInforme a opcao: ");
    }
    
    public static void Implementacao(){
        
        Scanner ler = new Scanner(System.in);
        GerenciamentoDeLivros Gerenciador = new GerenciamentoDeLivros();
        int opcao = 0;
        Livro.NomeBiblioteca = "Tavares";
        Livro P1 = new Livro();
        
        do{
            Menu();
            opcao = ler.nextInt();
            switch(opcao){

                case 0:
                    System.out.println("Saindo.");
                    break;
                    
                case 1:
                   Gerenciador.Inserir();
                   break;
                    
                case 2:
                    Gerenciador.RemoverLista();
                    break;   

                case 3:
                    Gerenciador.Pesquisar();
                    break;    

                case 4:
                    Gerenciador.ImprimirLista();
                    break;
                    
                case 5:
                    Gerenciador.AtualizarNomeBiblioteca();
                    break; 
                    
                default:
                    System.out.println("Opcao invalida.");
            }
        }while(opcao!=0);
    }
    
    public static void main(String[] args) {
        Implementacao();
    }
}
