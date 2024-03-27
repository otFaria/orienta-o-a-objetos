/*
    - Atributos: nome, identificação (ID), lista de projetos nos quais está envolvido.
    - Métodos: construtores, getters e setters, `toString`, `equals` e `hashCode`, métodos para adicionar e remover projetos.
*/
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario{
    private String Nome;
    private int ID;
    private List<Projeto> projetos_envolvidos;

    public Funcionario(){
        this.Nome = " ";
        this.ID = 0;
        this.projetos_envolvidos = new ArrayList<>();
    }
    
    public Funcionario(String Nome, int ID, List<Projeto> projetos) {
        this.Nome = Nome;
        this.ID = ID;
        this.projetos_envolvidos = projetos;
    }
    
    public void Adicionar_Projetos(Projeto P1){
        projetos_envolvidos.add(P1);
    }

    @Override
    public String toString() {
        return "Funcionario [Nome = " + Nome + ", ID = " + ID + "]";
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return Objects.equals(this.projetos_envolvidos, other.projetos_envolvidos);
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Projeto> getProjetos_envolvidos() {
        return projetos_envolvidos;
    }

    public void setProjetos_envolvidos(List<Projeto> projetos_envolvidos) {
        this.projetos_envolvidos = projetos_envolvidos;
    }
    
    
    
     
}
