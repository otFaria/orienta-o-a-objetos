/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade12;
import classes.Empresa;
import classes.Funcionario;
import classes.Projeto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Atividade12{
    
    public static void Menu(){
        System.out.println("\n\nBem - Vindo ao Menu");
        
        System.out.println("\nSelecione alguma das opçoes abaixo.");
        
        System.out.println("\n1- Adicionar Funcionario a Empresa. (Funcionario) ");
        System.out.println("2- Remover Funcionario da Empresa (ID do funcionario)");
        System.out.println("3- Adicinar Projeto para Empresa (Projeto)");
        System.out.println("4- Remover Projeto da Empresa (COD_Projeto)");
        System.out.println("5- Adicionar funcionario a projeto (Funcionario)");
        System.out.println("6- Remover Funcionario Do Projeto (ID,Cod_Projeto0.");
        System.out.println("7- Funcionario Mais Produtivo.");
        System.out.println("8- Funcionario Menos Produtivo.");
        System.out.println("9- Imprimir Lista de Funcionarios.");
        System.out.println("10- Imprimir Lista de Projetos.");
        System.out.println("0- Sair");
        
        System.out.println("\nSelecione alguma das opcoes acima.");
        System.out.print("Opcao: ");
    }
    
    public static Funcionario Preencher_Funcionario(Scanner scanner){
        Funcionario F1 = new Funcionario();
        
        System.out.println("\n\nPreencha os dados do FUNCIONARIO abaixo.");
        
        System.out.print("\nNome: ");
        F1.setNome(scanner.next());
        
        System.out.print("\nID: ");
        F1.setID(scanner.nextInt());
        
        return F1;
    }
    
    public static Projeto Preencher_Projeto(Scanner scanner){
        Projeto P1 = new Projeto();
        
        System.out.println("\nPreencha os dados do projeto Abaixo.");
        
        System.out.print("\nNome: ");
        P1.setNome_Projeto(scanner.next());
        
        System.out.print("\nCodigo do Projeto: ");
        P1.setCod_Projeto(scanner.nextInt());
        
        return P1;
    }
    
    public static void Implementacao(Scanner scanner , Empresa E1){
        int opcao = 0;
        int Index = 0;
        int Index2 = 0;
        Funcionario F1;
        Projeto P1;
        
        do{
            Menu();
            opcao = scanner.nextInt();
            
            switch(opcao){
                
                case 1:
                    F1 = Preencher_Funcionario(scanner);
                    E1.getFuncionarios().add(F1);
                    break;
                    
                case 2:
                    System.out.println("\nInforme o ID do funcionario para ser removido.");
                    System.out.print("ID: ");
                    E1.Remover_Funcionario(scanner.nextInt());
                    break;
                    
                case 3:
                    P1 = Preencher_Projeto(scanner);
                    E1.getProjetos().add(P1);
                    break;
                
                case 4:
                    System.out.println("\nMe informe o COD do projeto para ser removido.");
                    System.out.print("Codigo: ");
                    E1.Remover_Projeto(scanner.nextInt());
                    break;
                    
                 
            case 5:
                int ID = 0;
                System.out.println("Me informe o ID do funcionario para ser adicionado no projeto.");
                System.out.print("ID: ");
                ID = E1.Verifica_Se_Existe_Funcionario(scanner.nextInt());

                System.out.println("\nMe informe o codigo do projeto para o funcionario ser adicionado.");
                System.out.print("Codigo: ");
                Index = E1.Verifica_Se_Existe_Projeto(scanner.nextInt());

                if (Index != -1 && ID != -1) {
                    E1.getProjetos().get(Index).Adicionar_Funcionario_Projeto(E1.getFuncionarios().get(ID));
                    System.out.println("Funcionario adicionado ao projeto com sucesso.");
                } else {
                    System.out.println("\nCodigo do projeto ou ID do funcionario invalido.");
                }
                break;

                
            case 6:
                System.out.println("Me informe o ID do funcionario para ser Removido.");
                System.out.print("ID: ");
                Index = E1.Verifica_Se_Existe_Funcionario(scanner.nextInt());

                System.out.println("\nMe informe o codigo do projeto para o funcionario ser removido.");
                System.out.print("Codigo: ");
                Index2 = E1.Verifica_Se_Existe_Projeto(scanner.nextInt());

                if (Index != -1 && Index2 != -1) {
                    E1.getProjetos().get(Index2);
                } else {
                    System.out.println("Não foi possivel efetuar a operacao, pois o funcionario ou o projeto nao existem.");
                }
                break;
                    
                case 7:
                    System.out.print("\nFuncionario Mais Produtivo: " + E1.Funcionario_Mais_Produtivo());
                    break;
                    
                case 8:
                    System.out.print("\nFuncionario Menos Produtivo: " + E1.Funcionario_Menos_Produtivo());
                    break;
                
                case 9:
                    System.out.println("\nImprimindo Lista de funcionarios: ");
                    E1.Listar_Funcionarios();
                    break;
                    
                case 10:
                    System.out.println("\nImprimindo Lista de Projetos: ");
                    E1.Listar_Projetos();
                    break;
                    
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                    
                default:
                    System.out.println("Opcao invalida.");
            }
            
        }while(opcao != 0);
    }
    
    public static Empresa Preencher_Empresa(Scanner scanner){
        Empresa E1 = new Empresa();
        
        System.out.println("\nPreencha os dados abaixo.");
        
        System.out.print("Nome da Empresa: ");
        E1.setNome_Empresa(scanner.next());
       
        return E1;
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Empresa E1 = Preencher_Empresa(ler);
        Implementacao(ler, E1);
    }
}




