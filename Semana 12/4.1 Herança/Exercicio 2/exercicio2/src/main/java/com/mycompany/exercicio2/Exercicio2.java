package com.mycompany.exercicio2;

import Classes.Engenheiro;
import Classes.Diretor;
import Classes.Secretario;
import Classes.Gerente;

public class Exercicio2 {

    public static void main(String[] args) {
        Engenheiro engenheiro1 = new Engenheiro();
        Diretor diretor1 = new Diretor();
        Secretario secretario1 = new Secretario();
        Gerente gerente1 = new Gerente();

        System.out.println("ENGENHEIRO: ");
        engenheiro1.Preencher();
        engenheiro1.Imprimir();

        System.out.println("\nDIRETOR: ");
        diretor1.Preencher();
        diretor1.Imprimir();

        System.out.println("\nSECRETARIO: ");
        secretario1.Preencher();
        secretario1.Imprimir();

        System.out.println("\nGERENTE: ");
        gerente1.Preencher();
        gerente1.Imprimir();
    }
}
