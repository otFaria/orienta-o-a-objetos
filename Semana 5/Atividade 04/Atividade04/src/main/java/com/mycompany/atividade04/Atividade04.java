package com.mycompany.atividade04;
import classes.ContasAPagar;
import classes.PessoaFisica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Atividade04 {
    
    public static ContasAPagar Preencher_Conta(){
        Scanner ler = new Scanner(System.in);
        ContasAPagar C1 = new ContasAPagar();
        
        System.out.println("Preencha os dados da conta abaixo.");
        
        System.out.print("\nID: ");
        C1.setId(ler.nextInt());
        
        System.out.print("\nCodigo de Barras: ");
        C1.setCodigoDeBarras(ler.next());
        
        System.out.print("\nValor: ");
        C1.setValor(ler.nextDouble());
        
        return C1;
    }
    
    public static PessoaFisica Preencher_Pessoa(){
        PessoaFisica P1 = new PessoaFisica();
        Scanner ler = new Scanner(System.in);
        ContasAPagar C1;
        
        
        System.out.println("Preencha os dados da pessoa abaixo.");
        
        System.out.print("\nNome: ");
        P1.setNome(ler.next());
        
        System.out.print("\nEmail: ");
        P1.setEmail(ler.next());
        
        System.out.print("\nCPF: ");
        P1.setCPF(ler.next());
        
        System.out.println("\n\nInforme as dados das duas contas abaixo.");
        
        for(int i = 0; i < 2; i++){
            C1 = new ContasAPagar();
            System.out.print("\nConta 0" +(i+1) +": \n");
            C1 = Preencher_Conta();
            P1.getContas().add(C1);
        }
        
        return P1;
    }

    public static void main(String[] args){
        
        List<PessoaFisica> pessoas = new ArrayList<>();
        PessoaFisica MaiorDevedor = new PessoaFisica();
        double MaiorValor = 0.0;
        double SomaDasContas = 0.0;
        
        for(int i = 0; i < 1; i++){
            pessoas.add(Preencher_Pessoa());
        }
        
        //Pega o Maior Devedor.
        
        for(int i = 0; i < pessoas.size(); i++){
            for(int j = 0; j < 2; j++){
                SomaDasContas += pessoas.get(i).getContas().get(j).getValor();
                if (pessoas.get(i).getContas().get(j).getValor() > MaiorValor){
                    MaiorValor = pessoas.get(i).getContas().get(j).getValor();
                    MaiorDevedor = pessoas.get(i);
                }
            }
        }
        
        System.out.println("\n\nO Maior devedor é: \n");
        MaiorDevedor.Imprimir();
        
        System.out.println("\n\nO total das somas das dividas é: " + SomaDasContas);
    }
}
