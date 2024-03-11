package classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoDeMusica {
    
    private List<Musica> listaDeMusicas;

    public GerenciamentoDeMusica(){
        listaDeMusicas = new ArrayList<>();
    }
    
    public void inserir(){
        Musica m = new Musica();
        m.preencher();
        listaDeMusicas.add(m);
    }

    public void imprimirLista() {
        if(listaDeMusicas.isEmpty()){
            System.out.println("\n\nLista esta vazia.");
        }else{
            for (int i = 0; i < listaDeMusicas.size(); i++) {
                Musica m = listaDeMusicas.get(i);
                System.out.println(m.toString());
            }
        }
    }
    
    public void removerLista(){
        
        int index = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("\nEscolha o indice para remover.");
        System.out.print("Indice: ");
        index = ler.nextInt();
        
        if(listaDeMusicas.isEmpty()){
            System.out.println("\nNao ha nada para remover.");
        }else if(index < listaDeMusicas.size()){
            listaDeMusicas.remove(index);
        }else{
            System.out.println("Indice invalido.");
        }
    }
    
    public void pesquisar(){
        
        System.out.println("ATENCAO: DEVERIA SER PESQUISADOR POR ALGUM ID NAO PELO NOME, MAIS NAO FOI IMPLEMENTADO, O SISTEMA DE ID.");
        String titulo = " ";
        Scanner ler = new Scanner(System.in);
        System.out.print("\nInforme o nome da musica para ser pesquisado: ");
        titulo = ler.next();
        
        boolean encontrada = false;
        for(Musica m : listaDeMusicas){
            if(titulo.equals(m.getTitulo())){
                System.out.println("Musica encontrada com sucesso:");
                System.out.println(m.toString());
            }
        }
        if (!encontrada) {
            System.out.println("\n\nNenhuma musica encontrada com esse titulo.\n\n");
        }
    }
}

