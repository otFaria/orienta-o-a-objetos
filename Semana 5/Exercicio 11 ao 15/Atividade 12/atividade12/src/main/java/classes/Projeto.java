/*
    Métodos: construtores, getters e setters, toString, equals e hashCode, métodos para adicionar e remover funcionários.
*/

package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Projeto {
    public int Cod_Projeto;
    public String Nome_Projeto;
    public List<Funcionario> funcionarios;

    public Projeto() {
        this.Cod_Projeto = 0;
        this.Nome_Projeto = " ";
        this.funcionarios = new ArrayList<>();
    }
    
    public Projeto(int Cod_Projeto, String Nome_Projeto, List<Funcionario> funcionarios) {
        this.Cod_Projeto = Cod_Projeto;
        this.Nome_Projeto = Nome_Projeto;
        this.funcionarios = funcionarios;
    }
    

    @Override
    public String toString() {
        return "Projeto [Cod_Projeto=" + Cod_Projeto + ", Nome_Projeto=" + Nome_Projeto + "]";
    }

    
    public int Verifica_Se_Existe_Funcionario(int ID){
        
        for (int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getID() == ID)
                return i;
            else
                return -1;
        }
        return -1;
    }
    
  
    public void Adicionar_Funcionario_Projeto(Funcionario F1){
        this.funcionarios.add(F1);
        F1.Adicionar_Projetos(this);
    }

    
    public void Remover_Funcionario_Projeto(int ID , int Cod_Projeto){
        
        int Index = Verifica_Se_Existe_Funcionario(ID);
        
        if (Index != -1){
            funcionarios.get(Index).getProjetos_envolvidos().remove(Cod_Projeto);
            funcionarios.remove(Verifica_Se_Existe_Funcionario(Index));
        }else{
            System.out.println("\nFuncionario nao localizado.");
        }
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.Cod_Projeto;
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
        final Projeto other = (Projeto) obj;
        if (this.Cod_Projeto != other.Cod_Projeto) {
            return false;
        }
        return Objects.equals(this.funcionarios, other.funcionarios);
    }
    
    

    public int getCod_Projeto() {
        return Cod_Projeto;
    }

    public void setCod_Projeto(int Cod_Projeto) {
        this.Cod_Projeto = Cod_Projeto;
    }

    public String getNome_Projeto() {
        return Nome_Projeto;
    }

    public void setNome_Projeto(String Nome_Projeto) {
        this.Nome_Projeto = Nome_Projeto;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    
}
