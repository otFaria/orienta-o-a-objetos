package com.mycompany.atividade12;
import classes.GerenciamentoDeReserva;
import classes.Reserva;
import java.util.Scanner;

public class Atividade12 {
   
    public static void Menu(){
        
        System.out.println("--------------------------------------");
        
        System.out.println("Bem vindo ao menu.");
        
        System.out.println("\nSelecione as opcoes abaixo.");
        
        System.out.print("\n1 - Inserir reserva na lista.");
        System.out.print("\n2 - remover reserva da lista.");
        System.out.print("\n3 - pesquisar reserva na lista.");
        System.out.print("\n4 - imprimir reservas na lista.");
        System.out.print("\n0 - Sair.");
        System.out.println("\n--------------------------------------");
        
        System.out.print("\nInforme a opcao: ");
        
        
      
    }
    
    public static void Implementacao(){
        
        Scanner ler = new Scanner(System.in);
        GerenciamentoDeReserva Gerenciador = new GerenciamentoDeReserva();
        int opcao = 0;
        
        
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

            }
        }while(opcao!=0);
    }

    public static void main(String[] args) {
        
      Implementacao();
    }
}
