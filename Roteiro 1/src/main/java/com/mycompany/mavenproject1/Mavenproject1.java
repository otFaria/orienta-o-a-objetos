package com.mycompany.mavenproject1;
import classes.Triangulo;

public class Mavenproject1{

    public static void main(String[] args) {
       
        Triangulo P1 = new Triangulo();
        
        P1.Preencher();
        
        P1.PerimetroDoTriangulo();
        
        System.out.println(P1.Tipo());
    }
}
