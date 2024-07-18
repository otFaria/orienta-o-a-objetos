package com.mycompany.exercicio1;

import Classes.Eletronico;
import Classes.Movel;
import Classes.Perecivel;

public class Exercicio1 {

    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico(1, "TV", 2000.0, 1500.0, 10, 600);
        Movel movel = new Movel(2, "Cadeira", 300.0, 200.0, 5, "madeira maciça");
        Perecivel perecivel = new Perecivel(3, "Leite", 5.0, 3.0, 20, 15);

        System.out.println("ELETRONICO: ");
        eletronico.imprimirDetalhes();
        System.out.println("Preço com Desconto: " + eletronico.calcularDesconto(10));
        System.out.println("Custo Adicional: " + eletronico.calcularCustoAdicional());

        System.out.println("\nMOVEL: ");
        movel.imprimirDetalhes();
        System.out.println("Preço com Desconto: " + movel.calcularDesconto(10));
        System.out.println("Custo Adicional: " + movel.calcularCustoAdicional());

        System.out.println("\nPERECIVEL: ");
        perecivel.imprimirDetalhes();
        System.out.println("Preço com Desconto: " + perecivel.calcularDesconto(10));
        System.out.println("Custo Adicional: " + perecivel.calcularCustoAdicional());
    }
}
