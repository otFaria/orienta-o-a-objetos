/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.att9;

import classe.Departamento;
import classe.Funcionarios;
import classe.Gerente;

/**
 *
 * @author 12268535606
 */
public class Att9 {

    public static void main(String[] args) {
    Departamento ti = new Departamento("Computacao");

        Gerente gerenteTI = new Gerente("Victor", "G001", 7000.0, "Tecnologia da Informação");
        ti.setGerente(gerenteTI);

        Funcionarios funcionario1 = new Funcionarios("Mylena", "F001", 4500.0);
        Funcionarios funcionario2 = new Funcionarios("Igor", "F002", 4200.0);

        ti.adicionarFuncionario(funcionario1);
        ti.adicionarFuncionario(funcionario2);

        System.out.println("Gerente do Departamento de Computacao: " + ti.getGerente().getNome());
        System.out.println("Funcionários no Departamento de Computacao: "); 
        for (Funcionarios funcionario : ti.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }

        ti.removerFuncionario(funcionario1);
        System.out.println("Após a remoção, funcionários no Departamento da computacao:");
        for (Funcionarios funcionario : ti.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }
    }
}
