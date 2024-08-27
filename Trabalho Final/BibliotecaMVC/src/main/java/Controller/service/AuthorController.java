package Controller.service;

//Imports of Entities
import Model.entitites.Author;

//Imports needed
import java.util.ArrayList;
import java.util.List;

public class AuthorController{

    private List<Author> menegerAuthor;

    public AuthorController() {
        this.menegerAuthor = new ArrayList<>();
    }
    
    public void Add (Author author){
        
        Author  found = findAuthor(author.getCpf());
        
        if (found == null) {
            menegerAuthor.add(found);
        }else{
            //Tratar execeção do else;
            System.out.println("Já existe author com este cpf.");
        }
    }
    
    public void Remove(String cpf){
        
        Author found = findAuthor(cpf);
        
        if (found != null) {
            menegerAuthor.remove(found);
        }else{
            
            //Tratar com exeption;
            System.out.println("Author not found!");
        }
    }
    
    
    
    public Author findAuthor(String cpf){
        
        for (Author author : menegerAuthor) {
            if (author.getCpf().equalsIgnoreCase(cpf))
                return author;
        }
        
        return null;
    }

    public List<Author> getMenegerAuthor() {
        return menegerAuthor;
    }

    public void setMenegerAuthor(List<Author> menegerAuthor) {
        this.menegerAuthor = menegerAuthor;
    }
}