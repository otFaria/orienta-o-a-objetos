package com.mycompany.exercicio01;
import JFrame.JFtelainicial;
import classes.Aluno;
import classes.Professor;
import gerente.GerenteAluno;
import gerente.GerenteProfessor;
import java.io.IOException;

public class Exercicio01 {

  



    public static void TesteGerenteAluno(GerenteAluno gerenteAluno) {
        
        Aluno aluno1 = new Aluno(1, "João", "M", 20, 2022);
        Aluno aluno2 = new Aluno(2, "Maria", "F", 22, 2021);
        
        gerenteAluno.AdicionarAlunos(aluno1);
        gerenteAluno.AdicionarAlunos(aluno2);
        
        System.out.println("Alunos adicionados:");
        System.out.println(gerenteAluno);
        
        gerenteAluno.Editar(1, new Aluno(1, "João Pedro", "M", 21, 2022));
        System.out.println("Aluno editado:");
        System.out.println(gerenteAluno);
        
        gerenteAluno.RemoverAluno(2);
        System.out.println("Aluno removido:");
        System.out.println(gerenteAluno);
    }
    
    public static void TesteGerenteProfessor() {
        GerenteProfessor gerenteProfessor = new GerenteProfessor();
        
        Professor professor1 = new Professor(123, "Carlos", "M", 45);
        Professor professor2 = new Professor(456, "Ana", "F", 38);
        
        gerenteProfessor.Adiciona_Professor(professor1);
        gerenteProfessor.Adiciona_Professor(professor2);
        
        System.out.println("Professores adicionados:");
        System.out.println(gerenteProfessor);
        
        gerenteProfessor.Atualizar(123, new Professor(123, "Carlos Alberto", "M", 46));
        System.out.println("Professor editado:");
        System.out.println(gerenteProfessor);
        
        gerenteProfessor.Remover(456);
        System.out.println("Professor removido:");
        System.out.println(gerenteProfessor);
    }

    public static void main(String[] args) throws IOException {
        
        JFtelainicial tela = new JFtelainicial();
        tela.setVisible(true);
        
               
               
    }
}
