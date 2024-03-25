package com.mycompany.atividade5;
import classes.Motorista;
import classes.Carro;
import java.util.Scanner;
public class Atividade5 {
    
    public static Carro Preencher_Carro(Scanner scanner){
        Carro C1 = new Carro();
        
        System.out.println("\nPreencha os dados do CARRO abaixo.");
        
        System.out.print("\nModelo: ");
        C1.setModelo(scanner.next());
        
        System.out.print("\nCor: ");
        C1.setCor(scanner.next());
        
        System.out.print("\nAno: ");
        C1.setAno(scanner.nextInt());
        
        return C1;
    }
    
    public static Motorista Preencher_Motorista(Scanner scanner){
        Motorista M1 = new Motorista();
        
        System.out.println("Preencha os dados do MOTORISTA abaixo.");
        
        System.out.print("\nNome: ");
        M1.setNome(scanner.next());
        
        M1.setCarro(Preencher_Carro(scanner));
        
        return M1;
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Motorista M1 = Preencher_Motorista(ler);
        M1.Imprimir();
        M1.getCarro().Buzinar();
        M1.getCarro().AbirPorta();
    }
}
