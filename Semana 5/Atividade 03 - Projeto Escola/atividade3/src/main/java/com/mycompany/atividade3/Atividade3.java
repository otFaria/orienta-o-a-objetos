package com.mycompany.atividade3;
import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import java.util.Scanner;
public class Atividade3 {
    
    public static Aluno Preencher_Aluno(){
        Aluno A1 = new Aluno();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\n\nPreencha os dados do ALUNO abaixo.");
        
        System.out.print("\nNome: ");
        A1.setNome(ler.next());
        
        System.out.print("\nSexo (M/F): ");
        A1.setSexo(ler.next().charAt(0));
        
        System.out.print("\nIdade: ");
        A1.setIdade(ler.nextInt());
        
        System.out.print("\nCPF (Apenas Numeros): ");
        A1.setCPF(ler.next());
        
        System.out.print("\nMatricula: ");
        A1.setMatricula(ler.next());
        
        System.out.print("\nAno de Ingresso: ");
        A1.setAnoDeIngresso(ler.nextInt());
        
        return A1;
    }
    
    public static Professor Preencher_Professor(){
        Professor P1 = new Professor();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\n\nPreencha os dados do PROFESSOR abaixo.");
        
        System.out.print("\nNome: ");
        P1.setNome(ler.next());
        
        System.out.print("\nSexo (M/F): ");
        P1.setSexo(ler.next().charAt(0));
        
        System.out.print("\nIdade: ");
        P1.setIdade(ler.nextInt());
        
        System.out.print("\nCPF (Apenas Numeros): ");
        P1.setCPF(ler.next());
   
        return P1;
    }
    
    public static Disciplina Preencher_Diciplina(){
        int Quantidade = 0;
        Disciplina D1 = new Disciplina();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\n\nPreencha os dados da DISCIPLINA abaixo.");
        
        System.out.print("\nNome: ");
        D1.setNome(ler.next());
              
        System.out.print("\nSemestre: ");
        D1.setSemestre(ler.nextInt());
        
        System.out.print("\nHorario: ");
        D1.setHorario(ler.next());
    
        D1.setProfessor(Preencher_Professor());
        
        System.out.println("\nMe informe quantos ALUNOS estão cadastrados na DISCIPLINA.");
        
        do{
            System.out.print("Quantidade: ");
            Quantidade = ler.nextInt();
            
            if(Quantidade <= 0){
                System.out.println("\n--------------------");
                System.out.println("\nQUANTIDADE INVALIDA.");
                System.out.println("--------------------\n");
            }
        }while(Quantidade <= 0);
        
        for(int i = 0; i < Quantidade; i++){
            D1.getAlunos().add(Preencher_Aluno());
        }
   
        return D1;
    }

    public static void main(String[] args) {
        Disciplina D1 = Preencher_Diciplina();
        Disciplina D2 = Preencher_Diciplina();
        System.out.println("Disciplina 1: ");
        D1.Imprimir();
        System.out.println("\n\nDisciplina 2: ");
        D2.Imprimir();
        
        System.out.println("\n\nDisciplina 2 Copiando Disciplina 1...\n\n");
        D2.Copia(D1);
        
        System.out.println("Disciplina 2 é igual a Disiciplina 1: ");
        D2.Imprimir();
    }
}
