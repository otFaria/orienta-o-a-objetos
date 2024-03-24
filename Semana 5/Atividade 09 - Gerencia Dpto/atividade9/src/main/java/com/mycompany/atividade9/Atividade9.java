package com.mycompany.atividade9;
import classes.Departamento;
import classes.Funcionario;
import classes.Gerente;

public class Atividade9 {
    
    public static void main(String[] args) {
        Departamento D1 = new Departamento("Matematica");
        
        Gerente gerente1 = new Gerente("Bastiao", 004, 2500.0, "Fisica");
        D1.setGerente(gerente1);
        
        Funcionario F1 = new Funcionario("Maricota", 01, 5600.0);
        Funcionario F2 = new Funcionario("Pedrada", 02, 3200.0);

        D1.adicionarFuncionario(F1);
        D1.adicionarFuncionario(F2);

        System.out.println("Gerente do Departamento: " + D1.getGerente().getNome());
        System.out.println("Funcionarios no Departamento: ");
        for(Funcionario funcionario : D1.getFuncionarios()){
            funcionario.Imprimir();
    }
        
        D1.removerrFuncionario(F1);
        System.out.println("Apos a remoçao, funcionarios do Departamento: ");
        for(Funcionario funcionario : D1.getFuncionarios()){
            funcionario.Imprimir();
        }
    }
}

