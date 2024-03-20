package com.mycompany.atividade02;
import classes.Carro;
import classes.Propietario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade02 {
    
    public static Propietario Preencher(){
        int Quant = 0;
        Propietario P1 = new Propietario();
        Carro C1 = new Carro();
        List <Carro> carros = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe os dados abaixo.");
        
        System.out.print("\nNome = ");
        P1.setNome(ler.next());
        
        System.out.print("\nNome = ");
        P1.setNome(ler.next());
        
        System.out.print("\nNome = ");
        P1.setNome(ler.next());
     
        System.out.print("\nCarro: ");
        C1.Preencher();
        carros.add(C1);
        P1.setCarro(carros);
        
        return P1;
    }

    public static void main(String[] args) {
        Propietario P1 = Preencher();
        Propietario P2 = Preencher();
        
        if(P1.getCarro().get(0).getModelo().equals(P2.getCarro().get(0).getModelo()))
            System.out.println("O modelo do carro do Propietario 1 e igual ao modelo do carro do Propietario 2.");
        else
            System.out.println("O modelo do carro do Propietario 1 não é igual ao modelo do carro do Propietario 2.");
    }
   
}
