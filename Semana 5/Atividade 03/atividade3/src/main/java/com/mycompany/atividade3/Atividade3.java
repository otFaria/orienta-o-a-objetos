package com.mycompany.atividade3;
import classes.Aluno;
import classes.Telefone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Atividade3 {
    
    public static Aluno Preencher(){
        int Quant = 0;
        Aluno A1 = new Aluno();
        Scanner ler = new Scanner(System.in);
        List<Telefone> telefones = new ArrayList();
        
        System.out.println("Preencha os dados abaixo.");
        
        System.out.print("\nNome: ");
        A1.setNome(ler.next());
        
        System.out.print("\nMatricula: ");
        A1.setMatricula(ler.next());
        
        System.out.print("\nEmail: ");
        A1.setEmail(ler.next());
        
        System.out.print("\nCurso: ");
        A1.setCurso(ler.next());
        
        System.out.println("Agora informe quantos numeros serão inseriodos.");
        System.out.print("Quantidade: ");
        do{
            Quant = ler.nextInt();
            if(Quant < 0)
                System.out.println("Numero informado invalido.");
        }while(Quant < 0);
        
        for (int i = 0; i < Quant; i++) {
            System.out.print("\nTelefone " + (i+1) + ": ");
            Telefone T1 = new Telefone();
            telefones.add(T1);
        }
        A1.setTelefones(telefones);
        return A1;
    }

    public static void main(String[] args) {
        Aluno A1 = Preencher();
        Aluno A2 = Preencher();
        Aluno A3 = Preencher();
        Aluno A4 = Preencher();
        Aluno A5 = Preencher();
    }
}
