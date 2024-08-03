package com.mycompany.exercicio10;
import classes.Alimento;
import classes.Eletronico;
import classes.Roupa;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Eletronico E1 = new Eletronico();
        Scanner f = new Scanner(System.in);
        
        System.out.println("Eletronico: ");
        
        System.out.println("Preencha os dados abaixo: ");
        
        System.out.println("\nCodigo do produto: ");
        E1.setCodigo_produto(f.nextInt());
        System.out.println("\nNome: ");
        E1.setNome(f.next());
        System.out.println("\nPreco: ");
        E1.setPreco(f.nextDouble());
        
        System.out.println("Me informe o valor de desconto para o Eletronico: ");
        
        E1.calculaDesconto(f.nextDouble());
        
        Roupa R1 = new Roupa();

        System.out.println("Roupa:");

        System.out.println("Preencha os dados abaixo:");

        System.out.println("\nCodigo do produto:");
        R1.setCodigo_produto(f.nextInt());
        System.out.println("\nNome:");
        R1.setNome(f.next());
        System.out.println("\nPreco:");
        R1.setPreco(f.nextDouble());

        System.out.println("Me informe o valor de desconto para a Roupa:");

        R1.calculaDesconto(f.nextDouble());
        
        Alimento A1 = new Alimento();

        System.out.println("Alimento:");

        System.out.println("Preencha os dados abaixo:");

        System.out.println("\nCodigo do produto:");
        A1.setCodigo_produto(f.nextInt());
        System.out.println("\nNome:");
        A1.setNome(f.next());
        System.out.println("\nPreco:");
        A1.setPreco(f.nextDouble());

        System.out.println("Me informe o valor de desconto para o Alimento:");

        A1.calculaDesconto(f.nextDouble());
    }
}
