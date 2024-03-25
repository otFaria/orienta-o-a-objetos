package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Banco {

    private String NomeBanco;
    List<Transacao> transacoes;
    List<Conta> contas;

    public Banco() {
        this.NomeBanco = " ";
        this.transacoes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public Banco(String NomeBanco, List<Transacao> transacoes, List<Conta> contas) {
        this.NomeBanco = NomeBanco;
        this.transacoes = transacoes;
        this.contas = contas;
    }

    private int VerificaSeExisteConta(int ID_Conta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta() == ID_Conta) {
                return i;
            }
        }
        return -1;
    }

    public int LocalizaConta(int ID_Conta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta() == ID_Conta) {
                return i;
            }
        }
        return -1;
    }

    public void AdicionarConta(Conta C1) {
        int contaExistente = VerificaSeExisteConta(C1.getNumeroConta());

        if (contaExistente == -1) {
            contas.add(C1);
            System.out.println("Conta adicionada com sucesso");
        } else {
            System.out.println("Não foi possível adicionar a conta, pois a conta já existe.");
        }
    }

    public Conta VerificaMaiorSaldo() {
        double MaiorSaldo = -999999999;
        Conta C2 = new Conta();

        for (Conta C1 : contas) {
            if (C1.getSaldoConta() > MaiorSaldo) {
                MaiorSaldo = C1.getSaldoConta();
                C2 = C1;
            }
        }
        return C2;
    }

    public int VerificaTotalDeDevedores() {
        int Contador = 0;

        for (Conta C1 : contas) {
            if (C1.getSaldoConta() < 0) {
                Contador++;
            }
        }
        return Contador;
    }

    public Conta VerificaMenorSaldo() {
        double MenorSaldo = 999999999;
        Conta C2 = new Conta();

        for (Conta C1 : contas) {
            if (C1.getSaldoConta() < MenorSaldo) {
                MenorSaldo = C1.getSaldoConta();
                C2 = C1;
            }
        }
        return C2;
    }

    public void ListarContas() {
        System.out.println(contas);
    }

    public void ListarTransacoes() {
        System.out.println(transacoes);
    }

    public void RemoverConta(int ID_Conta) {
        int AchaConta = VerificaSeExisteConta(ID_Conta);

        if (AchaConta != -1) {
            contas.remove(AchaConta);
            System.out.println("Conta removida com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void Deposito(int AchaConta, Transacao T1) {
        contas.get(AchaConta).Depositar(T1.getValor());
        transacoes.add(T1);
    }

    private boolean Saque(int AchaConta, Transacao T1) {
        if (LocalizaConta(T1.getContaAssociada()) != -1) {
            if (contas.get(LocalizaConta(T1.getContaAssociada())).getSaldoConta() >= T1.getValor()) {
                contas.get(LocalizaConta(T1.getContaAssociada())).Sacar(T1.getValor());
                transacoes.add(T1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private void Transferencia(Transacao T1, int ID_Tranderencia) {
        int AchaConta = VerificaSeExisteConta(T1.getContaAssociada());

        if (AchaConta != -1) {
            contas.get(LocalizaConta(T1.getContaAssociada())).Depositar(T1.getValor());
            contas.get(AchaConta).Sacar(T1.getValor());
            transacoes.add(T1);
        }
    }

    public void EfetuarMovimentacoes(Transacao T1) {
        int AchaConta = VerificaSeExisteConta(T1.getContaAssociada());

        if (AchaConta != -1) {
            if (T1.getTipo().equalsIgnoreCase("Deposito")) {
                Deposito(AchaConta, T1);
            } else if (T1.getTipo().equalsIgnoreCase("Saque")) {
                if (Saque(AchaConta, T1)) {
                    System.out.println("Saque Realizado com Sucesso.");
                } else {
                    System.out.println("O dinheiro do saque é maior que o saldo da conta.");
                }
            } else if (T1.getTipo().equalsIgnoreCase("Transferencia")) {
                Transferencia(T1, T1.getContaAssociada());
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.NomeBanco);
        hash = 17 * hash + Objects.hashCode(this.transacoes);
        hash = 17 * hash + Objects.hashCode(this.contas);
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
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.NomeBanco, other.NomeBanco)) {
            return false;
        }
        if (!Objects.equals(this.transacoes, other.transacoes)) {
            return false;
        }
        return Objects.equals(this.contas, other.contas);
    }

    public String getNomeBanco() {
        return NomeBanco;
    }

    public void setNomeBanco(String NomeBanco) {
        this.NomeBanco = NomeBanco;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

