package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Departamento {
    private String nome;
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        
    }
    
    public Departamento() {
        this.nome = "";
        this.gerente = new Gerente();
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Departamento{" + 
                "nome=" + nome + 
                ", gerente=" + gerente + 
                ", funcionarios=" + funcionarios + 
                '}';
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso!");
    }
    
    public void removerrFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
        System.out.println("Funcionario removido com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.gerente);
        hash = 17 * hash + Objects.hashCode(this.funcionarios);
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
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.gerente, other.gerente)) {
            return false;
        }
        return Objects.equals(this.funcionarios, other.funcionarios);
    }
}