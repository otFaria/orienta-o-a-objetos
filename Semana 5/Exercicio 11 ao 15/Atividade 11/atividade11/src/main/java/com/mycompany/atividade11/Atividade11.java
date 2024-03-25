package com.mycompany.atividade11;
import classes.Banco;
import classes.Conta;
import classes.Transacao;

public class Atividade11 {

    public static void main(String[] args) {
        Banco B1 = new Banco();
        Conta C1 = new Conta(01, "Otavio" , 150.00);
        Conta C2 = new Conta(02, "Jose rui" , 999999.00);
        Conta C3 = new Conta(03, "Bastiao" , -150.00);
        
        Transacao T1 = new Transacao(01, "SAQUE", 120.00, Transacao.dataHoraAtual() , 01);
        Transacao T2 = new Transacao(02, "DEPOSITO", 200.00, Transacao.dataHoraAtual(), 02);
        Transacao T3 = new Transacao(03, "TRANSFERENCIA", 50.00, Transacao.dataHoraAtual(), 03);
        
        B1.AdicionarConta(C1);
        B1.AdicionarConta(C2);
        B1.AdicionarConta(C3);
        
        B1.EfetuarMovimentacoes(T1);
        
        System.out.println("\nLISTANDO CNTAS APOS SAQUE\n");
        B1.ListarContas();
        
        B1.EfetuarMovimentacoes(T2);
        
        System.out.println("\nLISTANDO CNTAS APOS DEPÓSITO\n");
        B1.ListarContas();
        
        B1.EfetuarMovimentacoes(T3);
        
        System.out.println("\nLISTANDO CNTAS APOS TRANSFERÊNCIA\n");
        B1.ListarContas();
        
        System.out.println("\nLISTANDO TRANSACOES\n");
        B1.ListarTransacoes();
        
    }
}

