package classe;

import java.util.Scanner;

public class Triangulo {
    private Ponto[] pontos;
    
    public Triangulo(){
        for(int i = 0; i < 3; i++){
            pontos = new Ponto[i];
        }
    }
    
    public String Tipo(){
        String Texto = " ";
        
        return Texto;
    }
    
    public double Area(){
        
        double Area = 0.0;
        double MaiorX = -999999999;
        double MenorX = 999999999;
        double MaiorY = -999999999;
        double MenorY = 999999999;
        
        
        
        for (int i = 0; i < 3; i++) {
            if(MaiorX < pontos[i].getX()){
                MaiorX = pontos[i].getX();
            }
            if(MenorX > pontos[i].getX()){
                MenorX = pontos[i].getX();
            }
            if(MaiorY < pontos[i].getY()){
                MaiorY = pontos[i].getY();
            }
            if(MenorY > pontos[i].getY()){
                MenorY = pontos[i].getY();
            }
        }
        
        Area = 
        
        
        return Area;
    }
    
    public void Preencher(){
        Scanner ler = new Scanner (System.in);
        double Aux = 0.0;
      
        System.out.println("Preencha abaixo.");
        
        System.out.println("Ponto 1.");
        System.out.print("X: ");
        Aux = ler.nextInt();
        this.pontos[0].setX(Aux);
        System.out.print("Y: ");
        Aux = ler.nextInt();
        this.pontos[0].setY(Aux);
        
        System.out.println("\n\nPonto 2.");
        System.out.print("X: ");
        Aux = ler.nextInt();
        this.pontos[1].setX(Aux);
        System.out.print("Y: ");
        Aux = ler.nextInt();
        this.pontos[1].setY(Aux);
        
        System.out.println("\n\nPonto 3.");
        System.out.print("X: ");
        Aux = ler.nextInt();
        this.pontos[2].setX(Aux);
        System.out.print("Y: ");
        Aux = ler.nextInt();
        this.pontos[2].setY(Aux);
    }
    
    
    
    public void VerificaColinear(){
        /*
        |x1 y1| = x1*y2 - y1*x2 = 0 São colineres != 0 não são colineares
        |x2 y2|
        |x3 y2|
        */
         double Determinante = pontos[0].getX() * (pontos[1].getY() - pontos[2].getY()) + pontos[1].getX() * (pontos[2].getY() - pontos[0].getY()) + pontos[2].getX() *(pontos[0].getY() - pontos[1].getY());
         
         if(Determinante == 0){
             System.out.println("Eh Linear.");
         }else{
             System.out.println("Nao eh linear");
         }
    }
}
