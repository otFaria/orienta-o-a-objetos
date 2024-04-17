package com.mycompany.atividade04;

import classes.Carro;
import classes.GerenteCarro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Atividade04 {

     public static void TesteSerializador() throws IOException{
        List<Carro> carros = new ArrayList<>();
        Carro C1 = new Carro(0, "Volvo", "C512", 2024, 500000.0);
        Carro C2 = new Carro(1, "Fiat", "Strada", 2022, 130000.0);
        
        
        carros.add(C1);
        carros.add(C2);
        
        GerenteCarro gerente = new GerenteCarro(carros);
        
        gerente.SaveToFile("Teste.txt");
        
        gerente.Excluir_Carro(0);
        gerente.Excluir_Carro(1);
        
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
