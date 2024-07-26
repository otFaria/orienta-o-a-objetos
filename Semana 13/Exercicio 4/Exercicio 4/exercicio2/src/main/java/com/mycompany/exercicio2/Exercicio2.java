package com.mycompany.exercicio2;

import Classes.Funcionario;
import Classes.Engenheiro;
import Classes.Diretor;
import Classes.Secretario;
import Classes.Gerente;
import Classes.SalarioInvalidoException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {

            System.out.println("FUNCIONARIO: ");
            Funcionario f1 = preencherFuncionario(ler);
            f1.aumentarSalario();
            f1.Imprimir();

            System.out.println("\nENGENHEIRO: ");
            Engenheiro e1 = preencherEngenheiro(ler);
            e1.aumentarSalario();
            e1.Imprimir();

            System.out.println("\nDIRETOR: ");
            Diretor d1 = preencherDiretor(ler);
            d1.aumentarSalario();
            d1.calcularBonusAnual();
            d1.Imprimir();

            System.out.println("\nSECRETARIO: ");
            Secretario s1 = preencherSecretario(ler);
            s1.organizarAgenda();
            s1.Imprimir();

            System.out.println("\nGERENTE: ");
            Gerente g1 = preencherGerente(ler);
            g1.aumentarSalario();
            g1.Imprimir();
        } catch (SalarioInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static Funcionario preencherFuncionario(Scanner ler) throws SalarioInvalidoException {
        Funcionario f = new Funcionario();
        System.out.print("Nome: ");
        f.setNome(ler.nextLine());
        System.out.print("ID: ");
        f.setId(ler.nextInt());
        System.out.print("Salario: ");
        f.setSalario(ler.nextDouble());
        System.out.print("Em Estoque (true/false): ");
        f.setEmEstoque(ler.nextBoolean());
        return f;
    }

    private static Engenheiro preencherEngenheiro(Scanner ler) throws SalarioInvalidoException {
        Engenheiro e = new Engenheiro();
        System.out.print("Nome: ");
        e.setNome(ler.nextLine());
        System.out.print("ID: ");
        e.setId(ler.nextInt());
        System.out.print("Salario: ");
        e.setSalario(ler.nextDouble());
        System.out.print("Em Estoque (true/false): ");
        e.setEmEstoque(ler.nextBoolean());
        
        return e;
    }

    private static Diretor preencherDiretor(Scanner ler) throws SalarioInvalidoException {
        Diretor d = new Diretor();
        System.out.print("Nome: ");
        d.setNome(ler.nextLine());
        System.out.print("ID: ");
        d.setId(ler.nextInt());
        System.out.print("Salario: ");
        d.setSalario(ler.nextDouble());
        System.out.print("Em Estoque (true/false): ");
        d.setEmEstoque(ler.nextBoolean());
        
        return d;
    }

    private static Secretario preencherSecretario(Scanner ler) throws SalarioInvalidoException {
        Secretario s = new Secretario();
        System.out.print("Nome: ");
        s.setNome(ler.nextLine());
        System.out.print("ID: ");
        s.setId(ler.nextInt());
        System.out.print("Salario: ");
        s.setSalario(ler.nextDouble());
        System.out.print("Em Estoque (true/false): ");
        s.setEmEstoque(ler.nextBoolean());
        
        return s;
    }

    private static Gerente preencherGerente(Scanner ler) throws SalarioInvalidoException {
        Gerente g = new Gerente();
        System.out.print("Nome: ");
        g.setNome(ler.nextLine());
        System.out.print("ID: ");
        g.setId(ler.nextInt());
        System.out.print("Salario: ");
        g.setSalario(ler.nextDouble());
        System.out.print("Em Estoque (true/false): ");
        g.setEmEstoque(ler.nextBoolean());
        return g;
    }
}