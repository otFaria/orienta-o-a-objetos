package com.mycompany.atividade05;

import classes.Casa;
import classes.GerenciadorCasa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Atividade05 {
    
    public static void TesteSerializador() throws IOException{
        
        List<Casa> casas = new ArrayList<>();
        
        Casa C1 = new Casa(0, "Apartamento", 4, 5, 70, 500000.0);
        Casa C2 = new Casa(1, "Kit-Net", 1, 1, 40, 78000.0);
        
        
        
        casas.add(C1);
        casas.add(C2);
        
        GerenciadorCasa gerente = new GerenciadorCasa(casas);
        
        gerente.SaveToFile("Teste.txt");
        
        gerente.Remover_Casa(0);
        gerente.Remover_Casa(1);
        
        System.out.print("\n\n");
        
        System.out.println("Teste 1:");
        System.out.println(gerente);
        
        gerente.LoadFromFile("Teste.txt");
        
        System.out.println("Teste 2:");
        System.out.println(gerente);
    }

    public static void main(String[] args) throws IOException {
        TesteSerializador();
    }
}
