package Classes;

public class Funcionario {
    protected String nome;
    protected int id;
    protected double salario;
    protected boolean emEstoque;

    public Funcionario() {
        this.nome = "";
        this.id = 0;
        this.salario = 0.0;
        this.emEstoque = false;
    }

    public Funcionario(String nome, int id, double salario, boolean emEstoque) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.emEstoque = emEstoque;
    }

  

    public void Imprimir() {
        System.out.println(toString());
    }

    public void aumentarSalario() {// Aumento padrão de 5%
        this.salario += this.salario * 0.05; 
    }

    @Override
    public String toString() {
        String Funcionario = "Nome: " + this.nome + "\nID: " + this.id + "\nSalário: R$ " + this.salario;
        return Funcionario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario <= 0)
            throw new SalarioInvalidoException ("Salario e 0 ou menor que 0.");
        
        this.salario = salario;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }
}
