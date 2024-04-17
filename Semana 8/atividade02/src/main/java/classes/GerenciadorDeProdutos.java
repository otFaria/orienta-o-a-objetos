package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {
    
    private List<Produto> produtos;

    public GerenciadorDeProdutos(){
        produtos = new ArrayList<>();
    }

    public GerenciadorDeProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void AdicionarProduto(Produto P1){
        this.produtos.add(P1);
    }
    
    public void Excluir_Produto(int id){
        Produto P1 = Buscar_Produto(id);
        
        if (P1 != null) {
            this.produtos.remove(P1);
        }
    }
    
    public void Atualizar_Produto(int id , Produto produto_novo){
        Produto P1 = Buscar_Produto(id);
        
        if (P1 != null) {
            int index = produtos.indexOf(P1);
            produtos.set(index, produto_novo);
            System.out.println("Produto Atualizado com sucesso.");
        }else{
            System.out.println("Produto não localizado.");
        }
    }
    
    public Produto Buscar_Produto(int id){
          
        for(Produto produto : produtos){
            if (produto.getId() == id) {
                return produto;
            }
        }
        
        return null;
    }
    
    public void SaveToFile(String path) throws IOException{
        
        SerializadorCSVProduto serializador = new SerializadorCSVProduto();
        String csv = serializador.toCSV(produtos);
        
        FilePersistence filePe = new FilePersistence();
        filePe.SaveToFile(path, csv);
    }
    
    public void LoadFromFile(String path) throws FileNotFoundException{
        
       FilePersistence filePe = new FilePersistence();
       String LinhaLida = filePe.LoadFromFile(path);
       
       SerializadorCSVProduto serializador = new SerializadorCSVProduto();
       this.produtos = serializador.FromCsv(LinhaLida);
       
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Produtos = \n" + produtos;
    }
    
    
}