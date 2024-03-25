
package com.mycompany.Atividade10;

import classes.Autor;
import classes.Biblioteca;
import classes.Livro;
import java.util.List;
import java.util.Scanner;


public class Atividade10{
    
    public static int imprimeMenu() {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n\t----------- Biblioteca IFET ------------");
        System.out.println("\t1 - Inserir livro");
        System.out.println("\t2 - Remover livro");
        System.out.println("\t3 - Pesquisar livro (titulo)");
        System.out.println("\t4 - Pesquisar livro (autor)");
        System.out.println("\t5 - Pesquisar Autor (cidadeNatal)");
        System.out.println("\t6 - Listar todos os livros ");
        System.out.println("\t0 - Sair");
        System.out.println("\t-----------------------------------------");
        System.out.print("\tEscolha uma opção:");

        return ler.nextInt();
    }
    
    private static Livro criarLivroComAutores(Scanner ler) {
        System.out.println("Informe os dados do livro:");

        System.out.print("Título: ");
        String titulo = ler.nextLine();

        System.out.print("Ano de publicacao: ");
        int ano = ler.nextInt();
        ler.nextLine();

        Livro livro = new Livro(titulo, ano);

        String resposta = "n";
        
        do{
            Autor a = criarAutor(ler);
            livro.adicionarAutor(a);
            
            System.out.print("Existe mais autores neste livro (s/n) ?");
            resposta = ler.nextLine();            
        }while(resposta.equals("s"));
        

        return livro;
    }
    
    private static Autor criarAutor(Scanner ler) {
        System.out.println("Informe os dados do autor:");

        System.out.print("Nome: ");
        String nome = ler.nextLine();

        System.out.print("Cidade Natal: ");
        String cidadeNatal = ler.nextLine();

        return new Autor(nome, cidadeNatal);
    }
    
    public static void Implementacao(){

        Biblioteca B1 = new Biblioteca();
        Scanner ler = new Scanner(System.in);
        Livro livro = new Livro();

        int opcao = 0;
        do {
            opcao = imprimeMenu();

            switch (opcao) {
                case 1:
                    Livro novoLivro = criarLivroComAutores(ler);
                    B1.adicionarLivro(novoLivro);
                    break;

                case 2:
                    System.out.print("Informe o título do livro a remover: ");
                    String tituloParaRemover = ler.nextLine();
                    B1.removerLivro(tituloParaRemover);
                    break;

                case 3:
                    System.out.print("Informe o título do livro a pesquisar: ");
                    String tituloParaBuscar = ler.nextLine();
                    livro = B1.encontrarLivroPorTitulo(tituloParaBuscar);
                    livro.imprimir();
                    break;

                case 4:
                    System.out.print("Informe o nome do autor a pesquisar: ");
                    String nomeAutorParaBuscar = ler.nextLine();
                    livro = B1.encontrarLivroPorAutor(nomeAutorParaBuscar);
                    livro.imprimir();
                    break;

                case 5:
                    System.out.print("Informe a cidade natal do autor a pesquisar: ");
                    String cidadeParaBuscar = ler.nextLine();
                    List<Autor> lstAutores = B1.encontrarAutorPelaCidade(cidadeParaBuscar);
                    
                   
                    for(Autor a: lstAutores){
                        System.out.println(a);
                    }
                    break;

                case 6:
                    System.out.println(B1.toString());
                    break;
            }
        } while (opcao != 0);

        ler.close();
 
    }
    
   public static void main(String[] args){
        
       Implementacao();
    }
}