package classes;
import java.util.Scanner;

public class Triangulo {
    private Ponto[] pontos;
    
    public Triangulo(){
        
        pontos = new Ponto[3];
        
        for(int i = 0; i < 3; i++){
            pontos[i] = new Ponto();
        }
    }
    
    public double Area(){
        
        //Formula de Heron
        
        double Area = 0.0;
        
        double a,b,c,s;
        a = Math.sqrt(Math.pow(pontos[1].getX() - pontos[0].getX(),2) + Math.pow(pontos[1].getY() - pontos[0].getY(),2));
        b = Math.sqrt(Math.pow(pontos[2].getX() - pontos[1].getX(),2) + Math.pow(pontos[2].getY() - pontos[1].getY(),2));
        c = Math.sqrt(Math.pow(pontos[0].getX() - pontos[2].getX(),2) + Math.pow(pontos[0].getY() - pontos[2].getY(),2));
        
        
        s = ((a + b + c)/2);
        
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        return Area;
    }
    
    public void Preencher(){
        
        Scanner ler = new Scanner (System.in);
      
        System.out.println("Preencha abaixo.");
        
        System.out.println("Ponto 1.");
        System.out.print("X: ");
        this.pontos[0].setX(ler.nextDouble());
        
        System.out.print("Y: ");
        this.pontos[0].setY(ler.nextDouble());
        
        System.out.println("\n\nPonto 2.");
        System.out.print("X: ");
        this.pontos[1].setX(ler.nextDouble());
        
        System.out.print("Y: ");
        this.pontos[1].setY(ler.nextDouble());
        
        System.out.println("\n\nPonto 3.");
        System.out.print("X: ");
        this.pontos[2].setX(ler.nextDouble());
        
        System.out.print("Y: ");
        this.pontos[2].setY(ler.nextDouble());
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
    
    public double PerimetroDoTriangulo(){
        
        double Perimetro = 0.0;
        
        Perimetro = pontos[0].DistanciaEntrePontos(pontos[1]) + pontos[1].DistanciaEntrePontos(pontos[2]) + pontos[2].DistanciaEntrePontos(pontos[0]);
        
        return Perimetro;
    }
    
    public String Tipo(){
      
        if(pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[1].DistanciaEntrePontos(pontos[2]) && pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[0].DistanciaEntrePontos(pontos[2])){
            return "O tringulo e equilatero.";
        }else if (pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[0].DistanciaEntrePontos(pontos[2])){
            return "Eh Isoceles";
        }else if(pontos[0].DistanciaEntrePontos(pontos[1]) != pontos[1].DistanciaEntrePontos(pontos[2]) && pontos[0].DistanciaEntrePontos(pontos[1]) != pontos[0].DistanciaEntrePontos(pontos[2])){
            return "Eh Escaleno";
        }
        
        return null;
    }
}
