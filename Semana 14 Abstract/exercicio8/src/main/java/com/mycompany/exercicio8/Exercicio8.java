package com.mycompany.exercicio8;

import classes.Carro;
import classes.Moto;

public class Exercicio8 {

    public static void main(String[] args) {
        Moto m = new Moto();
        Carro c = new Carro();
        
        
        System.out.println("Moto:");
        m.entrarEstacionamento();
        m.sairEstacionamento();
        
        System.out.println("Carro: ");
        c.entrarEstacionamento();
        c.sairEstacionamento();
    }
}
