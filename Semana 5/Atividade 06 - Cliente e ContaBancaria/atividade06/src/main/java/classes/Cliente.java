package classes;
import java.util.Objects;
import java.util.Scanner;


public class Cliente {
    private ContaBancaria Conta;
    private String Nome;
    private String CPF;
    
    public Cliente(){
        this.Conta = new ContaBancaria();
        this.Nome = "";
        this.CPF = "";
    }
    
    public Cliente(ContaBancaria Conta, String Nome, String CPF){
        this.Conta = Conta;
        this.Nome = Nome;
        this.CPF = CPF;
    }

   @Override
    public String toString(){
        String Texto = "\nNome:" + this.Nome + "\nCPF:" + this.CPF + "\nConta:" + this.Conta;
        return Texto;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void depositar(){
        Scanner ler = new Scanner(System.in);
        double valorDeposito = 0.0;
        double saldoAtualizado = 0.0;
        System.out.println("Digite o valor que deseja depositar: ");
        valorDeposito = ler.nextDouble();
        saldoAtualizado = valorDeposito + this.Conta.getSaldo();
        this.Conta.setSaldo(saldoAtualizado);
    }
    
    public void exibirSaldo(){
        System.out.println(this.Conta.getSaldo() + "reais");
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.CPF);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.Conta, other.Conta);
    }

    public ContaBancaria getConta() {
        return Conta;
    }

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return CPF;
    }

    public void setConta(ContaBancaria Conta) {
        this.Conta = Conta;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }
}