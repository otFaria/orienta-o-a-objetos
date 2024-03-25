package com.mycompany.atividade3;

import classes.Aluno;
import classes.Telefone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Atividade3 {
    
    
    
    public static Telefone Preencher_Telefone(){
        Telefone T1 = new Telefone();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nPreencha os dados do telefone abaixo.");
        
        System.out.print("\nDDD: ");
        T1.setDDD(ler.nextInt());
        
        System.out.print("\nNumero: ");
        T1.setNumero(ler.next());
        
        System.out.print("\nDescrição: ");
        T1.setDescricao(ler.next());
        
        System.out.print("\nOperadora: ");
        T1.setOperadora(ler.next());
        
        return T1;
    }
    
    public static Aluno Preencher_Aluno(){
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
        
        System.out.println("Agora informe quantos numeros serão inseridos.");
        System.out.print("Quantidade: ");
        do{
            Quant = ler.nextInt();
            if(Quant < 0)
                System.out.println("\nQuantidade invalida.\n");
        }while(Quant < 0);
        
        for (int i = 0; i < Quant; i++) {
            System.out.print("\nTelefone " + (i+1) + ": ");
            Telefone T1 = Preencher_Telefone();
            telefones.add(T1);
        }
        A1.setTelefones(telefones);
        return A1;
    }

    public static void main(String[] args) {
        Aluno A1 = Preencher_Aluno();
        Aluno A2 = Preencher_Aluno();
        Aluno A3 = Preencher_Aluno();
        Aluno A4 = Preencher_Aluno();
        Aluno A5 = Preencher_Aluno();
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(A1);
        alunos.add(A2);
        alunos.add(A3);
        alunos.add(A4);
        alunos.add(A5);
        
        mesmoDDD(alunos);
        mesmaOperadora(alunos);
    }

    public static void mesmoDDD(List<Aluno> alunos) {
        Map<String, List<Aluno>> dddParaAlunos = new HashMap<>();
        for (Aluno aluno : alunos) {
            for (Telefone telefone : aluno.getTelefones()) {
                String ddd = String.valueOf(telefone.getDDD());

                if (!dddParaAlunos.containsKey(ddd)) {
                    dddParaAlunos.put(ddd, new ArrayList<>());
                }
                dddParaAlunos.get(ddd).add(aluno);
            }
        }
        System.out.println("\nAlunos agrupados por DDD:");
        dddParaAlunos.entrySet().forEach(entry -> {
            System.out.println("DDD: " + entry.getKey());
            entry.getValue().forEach(aluno -> System.out.println("Nome: " + aluno.getNome()));
        });
    }

    public static void mesmaOperadora(List<Aluno> alunos) {
        Map<String, List<Aluno>> operadoraDosAlunos = new HashMap<>();

        for (Aluno aluno : alunos) {
            for (Telefone telefone : aluno.getTelefones()) {
                String operadora = telefone.getOperadora();

                if (!operadoraDosAlunos.containsKey(operadora)) {
                    operadoraDosAlunos.put(operadora, new ArrayList<>());
                }
                operadoraDosAlunos.get(operadora).add(aluno);
            }
        }

        System.out.println("Alunos agrupados por operadora:");
        operadoraDosAlunos.entrySet().forEach(entry -> {
            System.out.println("Operadora: " + entry.getKey());
            entry.getValue().forEach(aluno -> System.out.println("Nome: " + aluno.getNome()));
        });
    }
}
