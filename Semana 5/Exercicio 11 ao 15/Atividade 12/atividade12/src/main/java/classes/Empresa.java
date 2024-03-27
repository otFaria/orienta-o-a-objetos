/*
    - Atributos: nome da empresa, lista de projetos disponíveis, lista de funcionários contratados.
    - Métodos: adicionar e remover projetos, adicionar e remover funcionários, listar todos os projetos e funcionários, identificar o funcionário mais e menos produtivo.
*/

package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa{
    
    private String Nome_Empresa;
    private List<Projeto> projetos;
    private List<Funcionario> funcionarios;

    public Empresa(){
        this.Nome_Empresa = " ";
        this.projetos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public Empresa(String Nome_Empresa, List<Projeto> projetos, List<Funcionario> funcionarios) {
        this.Nome_Empresa = Nome_Empresa;
        this.projetos = projetos;
        this.funcionarios = funcionarios;
    }
    
    public int Verifica_Se_Existe_Funcionario(int ID){
        
        for (int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getID() == ID)
                return i;
        }
        return -1;
    }
    
    public int Verifica_Se_Existe_Projeto(int Cod){
        
        for (int i = 0; i < projetos.size(); i++){
            if(projetos.get(i).getCod_Projeto() == Cod)
                return i;
            else
                return -1;
        }
        return -1;
    }
    
    

    public void Adicionar_Funcionarios_Empresa(Funcionario F1){
        if (Verifica_Se_Existe_Funcionario(F1.getID()) == -1){
            funcionarios.add(F1);
            System.out.println("\nFuncionario Adicionado.");
        }else{
            System.out.println("Funcionario ja existe.");
        }
    }
    
    public void Remover_Funcionario(int ID){
        int Index = Verifica_Se_Existe_Funcionario(ID);
        
        if (Index != -1){
            
            for (int i = 0; i < funcionarios.get(Index).getProjetos_envolvidos().size(); i++) {
                funcionarios.get(Index).getProjetos_envolvidos().remove(i);
            }
            
            funcionarios.remove(Index);
            System.out.println("\nFuncionario removido com sucesso.");
        }else{
            System.out.println("\nFuncionario nao Localizado.");
        }
    }  
    
    public Funcionario Funcionario_Mais_Produtivo(){
        Funcionario F2 = new Funcionario();
        int MaiorNumProjetos = 0;
        
        for(Funcionario F1 : funcionarios){
            if(F1.getProjetos_envolvidos().size() > MaiorNumProjetos){
                MaiorNumProjetos = F1.getProjetos_envolvidos().size();
                F2 = F1;
            }
        }
        
        return F2;
    }
    
    public Funcionario Funcionario_Menos_Produtivo(){
        Funcionario F2 = new Funcionario();
        int MenorNumProjetos = 999999999;

        for(Funcionario F1 : funcionarios){
            if(F1.getProjetos_envolvidos().size() < MenorNumProjetos){
                MenorNumProjetos = F1.getProjetos_envolvidos().size();
                F2 = F1;
            }
        }

        return F2;
    }

    
    public void Listar_Projetos(){
        System.out.println("\n Imprmindo Projetos da Empresa " + this.Nome_Empresa + ".");
        System.out.println(projetos.toString());
    }
    
    public void Listar_Funcionarios(){
        System.out.println("Imprmindo Funcionarios Empresa " + this.Nome_Empresa + ".");
        System.out.println("\n " + this.funcionarios + ".");
    }
    
    public void Adicionar_Projeto_Empresa(Projeto projeto){
        if (Verifica_Se_Existe_Funcionario(projeto.getCod_Projeto()) == -1){
            projetos.add(projeto);
        }else{
            System.out.println("Ja existe um projeto com este codigo.");
        }
    }
    
    public void Remover_Projeto(int Cod_Projeto){
        
        int index = Verifica_Se_Existe_Projeto(Cod_Projeto);
        
        if ( index != -1){
            
            for (int i = 0; i < projetos.get(index).getFuncionarios().size(); i++){
                projetos.get(index).getFuncionarios().remove(i);
            }
            projetos.remove(index);
            
            System.out.println("\nProjeto Removido com sucesso.");
        }
        else
            System.out.println("Codigo do projeto invalido. ");
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Nome_Empresa);
        hash = 97 * hash + Objects.hashCode(this.projetos);
        hash = 97 * hash + Objects.hashCode(this.funcionarios);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.Nome_Empresa, other.Nome_Empresa)) {
            return false;
        }
        if (!Objects.equals(this.projetos, other.projetos)) {
            return false;
        }
        return Objects.equals(this.funcionarios, other.funcionarios);
    }

    public String getNome_Empresa() {
        return Nome_Empresa;
    }

    public void setNome_Empresa(String Nome_Empresa) {
        this.Nome_Empresa = Nome_Empresa;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
