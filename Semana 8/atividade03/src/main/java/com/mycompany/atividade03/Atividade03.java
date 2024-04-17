package com.mycompany.atividade03;

import classes.Animal;
import classes.GerenciadorAnimal;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Atividade03 {
    
    public static void TesteSerializador() throws IOException{
        List<Animal> animais = new ArrayList<>();
        Animal A1 = new Animal(0, "Cachorro", "Pastor Alemão", 25.0, 5);
        Animal A2 = new Animal(1, "Passaro", "Papagaio", 7.0, 1);
        Animal A3 = new Animal(2, "Passaro", "Piriquito", 7.0, 1);
        
        
        animais.add(A1);
        animais.add(A2);
        
        GerenciadorAnimal gerente = new GerenciadorAnimal(animais);
        
        gerente.SaveToFile("Teste.txt");
        
        gerente.Excluir_Animal(0);
        gerente.Excluir_Animal(1);
        
        System.out.print("\n\n");
        
        System.out.println("Teste 1:");
        System.out.println(gerente);
        
        gerente.LoadFormFile("Teste.txt");
        
        System.out.println("Teste 2:");
        System.out.println(gerente);
    }

    public static void main(String[] args) throws IOException{
        TesteSerializador();
    }
}
