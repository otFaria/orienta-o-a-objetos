package classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoDeLivros{
    
    private List<Livro> ListaDeLivros;

    public GerenciamentoDeLivros(){
        ListaDeLivros = new ArrayList<>();
    }
    
    public void Inserir(){
        Livro livro = new Livro();
        livro.Preencher();
        ListaDeLivros.add(livro);
    }

    public void ImprimirLista() {
        if(ListaDeLivros.isEmpty()){
            System.out.println("\n\nLista esta vazia.");
        }else{
            for (int i = 0; i < ListaDeLivros.size(); i++) {
                Livro livro = ListaDeLivros.get(i);
                System.out.println(livro.toString());
            }
        }
    }
    
    public void RemoverLista(){
        
        int index = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("\nEscolha o indice para remover.");
        System.out.print("Indice: ");
        index = ler.nextInt();
        
        if(ListaDeLivros.isEmpty()){
            System.out.println("\nNao a nada para remover.");
        }else if(index < ListaDeLivros.size()){
            ListaDeLivros.remove(index);
        }else{
            System.out.println("Index invalido.");
        }
    }
    
    public void Pesquisar(){
        String Titulo = " ";
        Scanner ler = new Scanner(System.in);
        System.out.println("ATENCAO: DEVERIA SER PESQUISADO POR ID, MAIS NAO FOI EMPLEMENTADO");
        System.out.print("\nMe informe o titulo para ser pesquisado: ");
        Titulo = ler.next();
        
        for(Livro livro : ListaDeLivros){
            if(Titulo.equals(livro.getTitulo())){
                System.out.println("Livro encontrado com sucesso.");
                System.out.println(livro.toString());
                return;
            }
        }
        System.out.println("Nao foi encontrado nenhum livro.");
    }
    
    public void AtualizarNomeBiblioteca(){
        Scanner ler = new Scanner(System.in);
        String Novo = " ";
        System.out.print("Me informe um novo nome para a biblioteca: ");
        Novo = ler.next();
        Livro.NomeBiblioteca = Novo;
        System.out.println("Nome Atualizado com sucesso.");
    }
}
