package com.mycompany.exercicio1;

import Classes.Eletronico;
import Classes.Movel;
import Classes.Perecivel;

public class Exercicio1 {

    public static void main(String[] args) {
        
        
        Eletronico E1 = new Eletronico();
        Movel M1 = new Movel();
        Perecivel P1 = new Perecivel();
        
        System.out.println("ELETRONICO: ");
        
        E1.Preencher();
        E1.Imprimir();
        
        System.out.println("\nMovel: ");
        M1.Preencher();
        M1.Imprimir();
        
        System.out.println("\nPerecivel: ");
        P1.Preencher();
        P1.Imprimir();
    }
}
