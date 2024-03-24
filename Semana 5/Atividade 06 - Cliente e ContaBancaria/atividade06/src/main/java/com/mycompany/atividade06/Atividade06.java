package com.mycompany.atividade06;
import classes.Cliente;
import classes.ContaBancaria;
import java.util.Scanner;
public class Atividade06 {
    
    public static ContaBancaria Preencher_ContaBancaria(Scanner scanner){
        ContaBancaria C1 = new ContaBancaria();
        
        System.out.println("Preencha os dados da CONTA abaixo.");
        
        System.out.print("\nID: ");
        C1.setId(scanner.nextInt());
        
        System.out.print("\nNumero: ");
        C1.setNumero(scanner.nextInt());
        
        System.out.print("\nNome do Banco: ");
        C1.setNomeBanco(scanner.next());
        
        System.out.print("\nSaldo: ");
        C1.setSaldo(scanner.nextDouble());
        
        return C1;
    }
    
    public static Cliente Preencher_Cliente(Scanner scanner){
        Cliente C1 = new Cliente();
        
        System.out.println("Preencha os dados do CLIENTE abaixo.");
        
        System.out.print("\nNome: ");
        C1.setNome(scanner.next());
        
        System.out.print("\nCPF: ");
        C1.setCpf(scanner.next());
        
        System.out.print("\nNome: ");
        C1.setConta(Preencher_ContaBancaria(scanner));
        
        return C1;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente C1 = Preencher_Cliente(ler);
        
       C1.depositar();
       
       C1.exibirSaldo();
    }
}
