/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade11;
import com.mycompany.atividade11.Classe.Livro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Atividade11 {
    
    public static void Menu(){
        System.out.println("\nSelecione as opcoes abaixo.");
        
        System.out.print("\n 1 - Inserir livro");
        System.out.print("\n 2 - Remover livro");
        System.out.print("\n 3 - Pesquisar livro(Titulo)");
        System.out.print("\n 4 - Pesquisar livro (Autor)");
        System.out.print("\n 0 - Sair");
        System.out.print("\nEscolha a opcao: ");
    }

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        List<Livro> ListaLivro = new ArrayList<>();
  
        int opcao = 0;
        
        do{
        
            Menu();
            opcao = ler.nextInt();
        
            switch(opcao) {
                case 1:
                    Livro P1 = new Livro();
                    P1.Preencher();
                    ListaLivro.add(P1);
                    break;
                case 2:
                    System.out.println("Me informe o indice que você quer remover.");
                    int index = 0;
                    index = ler.nextInt();

                    if(index <= ListaLivro.size()){
                        ListaLivro.remove(index-1);
                        System.out.println("\nLivro removido com sucesso");
                    }else{
                        System.out.println("\nIndice invalido");
                    }
                    break; 

                case 3:

                    System.out.println("Me informe o titulo: ");
                    String titulo = ler.next();


                    for(int i = 0; i < ListaLivro.size(); i++){
                        Livro P2 = ListaLivro.get(i);
                        if(titulo.equals(P2.getTitulo())){
                            System.out.println("\nLivro encontrado com sucesso.");
                            System.out.println(P2.toString());
                         }
                    }
                    break;

                case 4:
                     System.out.println("Me informe o autor: ");
                     String Autor = ler.next();


                    for(int i = 0; i < ListaLivro.size(); i++){
                        Livro P2 = ListaLivro.get(i);
                        if(Autor.equals(P2.getAutor())){
                            System.out.println("\nLivro encontrado com sucesso.");
                            System.out.println(P2.toString());
                         }
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma finalizado.");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao != 0);
    }
}


