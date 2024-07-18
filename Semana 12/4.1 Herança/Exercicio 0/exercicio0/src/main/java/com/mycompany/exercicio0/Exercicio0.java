package com.mycompany.exercicio0;

import Classes.Professor;
import Classes.Aluno;

public class Exercicio0 {

    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Aluno aluno1 = new Aluno();

        System.out.println("PROFESSOR: ");
        professor1.Preencher();
        professor1.Imprimir();

        System.out.println("\nALUNO: ");
        aluno1.Preencher();
        aluno1.Imprimir();
    }
}
