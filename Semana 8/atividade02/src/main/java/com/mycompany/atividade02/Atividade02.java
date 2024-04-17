package com.mycompany.atividade02;

import classes.GerenciadorDeProdutos;
import classes.Produto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Atividade02 {
    
    public static void TesteSerializador() throws FileNotFoundException, IOException{
         
        List<Produto> produtos = new ArrayList<>();
        Produto P1 = new Produto(0, "Cadeira de Balanço", 425.0 , 225.0 , "Azul bebe");
        Produto P2 = new Produto(1, "Cadeira Gamer", 267.0 , 125.0 , "Black");
        
        produtos.add(P1);
        produtos.add(P2);
        
        GerenciadorDeProdutos gerente = new GerenciadorDeProdutos(produtos);
        
        gerente.SaveToFile("Teste.txt");
        
        gerente.Excluir_Produto(0);
        gerente.Excluir_Produto(1);
        
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
