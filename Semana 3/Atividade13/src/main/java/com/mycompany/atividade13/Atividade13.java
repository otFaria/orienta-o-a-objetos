package com.mycompany.atividade13;
import classes.GerenciamentoDeMusica;
import classes.Musica;
import java.util.Scanner;

public class Atividade13{
   
    public static void menu(){
        System.out.println("--------------------------------------");
        System.out.println("Bem-vindo ao menu.");
        System.out.println("\nSelecione as opcoes abaixo:");
        System.out.print("\n1 - Inserir musica na lista.");
        System.out.print("\n2 - Remover musica da lista.");
        System.out.print("\n3 - Pesquisar musica na lista.");
        System.out.print("\n4 - Imprimir musicas na lista.");
        System.out.print("\n0 - Sair.");
        System.out.println("\n--------------------------------------");
        System.out.print("\nInforme a opcao: ");
    }
    
    public static void implementacao(){
        Scanner ler = new Scanner(System.in);
        GerenciamentoDeMusica gerenciador = new GerenciamentoDeMusica();
        int opcao = 0;
        
        do {
            menu();
            opcao = ler.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Saindo.");
                    break;
                case 1:
                    gerenciador.inserir();
                    break;
                case 2:
                    gerenciador.removerLista();
                    break;
                case 3:
                    gerenciador.pesquisar();
                    break;
                case 4:
                    gerenciador.imprimirLista();
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while(opcao != 0);
    }

    public static void main(String[] args) {
        implementacao();
    }
}