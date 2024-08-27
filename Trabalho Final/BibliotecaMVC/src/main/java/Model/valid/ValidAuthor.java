package Model.valid;

import Model.entitites.Author;

public class ValidAuthor {
    
    public ValidAuthor(String cpf, String name, String hometown){
        
        Author author = new Author();
        
        if (cpf.isEmpty()){
            //Tratar exeption
        }
        
        author.setCpf(cpf);
        
        if(name.isEmpty()){
            //Tratar exeption
        }
        
        author.setName(name);
    }
    
}
