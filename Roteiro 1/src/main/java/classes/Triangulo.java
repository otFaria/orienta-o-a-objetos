package classes;

import java.util.Scanner;

public class Triangulo {

    private Ponto[] pontos;

    public Triangulo() {

        pontos = new Ponto[3];

        for (int i = 0; i < 3; i++) {
            pontos[i] = new Ponto();
        }
    }

    public double Area() {

        double Area = 0.0;
        Area = (Math.abs(Determinante())/2);
        return Area;
    }

    public void Preencher() {
        System.out.println("Preencha abaixo os pontos.");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ponto " + (i + 1) + ": ");
            pontos[i].Preencher();
        }
    }
    
    private double Determinante(){
       double Determinante = pontos[0].getX() * (pontos[1].getY() - pontos[2].getY()) + pontos[1].getX() * (pontos[2].getY() - pontos[0].getY()) + pontos[2].getX() * (pontos[0].getY() - pontos[1].getY()); 
       return Determinante;
    }

    public boolean VerificaColinear() {
        /*
        |x1 y1| = x1*y2 - y1*x2 = 0 São colineres != 0 não são colineares
        |x2 y2|
        |x3 y2|
         */
        
        double det = Determinante();
        
        if(det == 0.0)
            return true;
        else
            return false;
    }

    public boolean PerimetroDoTriangulo() {

        double Perimetro = 0.0;
        
        if(!VerificaColinear()){
            Perimetro = pontos[0].DistanciaEntrePontos(pontos[1]) + pontos[1].DistanciaEntrePontos(pontos[2]) + pontos[2].DistanciaEntrePontos(pontos[0]);
            System.out.println("O perímetro do triangulo é: " + Perimetro);
            return true;
        }else{
            System.out.println("Não é um triangulo.");
            return false;
        }
        
    }

    public String Tipo() {
        
        
        if(!VerificaColinear()){
            double AB,BC,CA,AC;
            
            AB = pontos[0].DistanciaEntrePontos(pontos[1]);
            BC = pontos[1].DistanciaEntrePontos(pontos[2]);
            CA = pontos[2].DistanciaEntrePontos(pontos[0]);
            AC = pontos[0].DistanciaEntrePontos(pontos[1]);
            
//          System.out.println(pontos[0].DistanciaEntrePontos(pontos[1]));
//          System.out.println(pontos[1].DistanciaEntrePontos(pontos[2]));
//          System.out.println(pontos[2].DistanciaEntrePontos(pontos[0]));
            
            if (AB == BC && BC == CA ) {
                return "O tringulo e equilatero.\n\n";
            } else if (AB == BC || AC == AC || BC == AC){
                return "É Isosceles\n\n";
            }else if (AB != BC && AB != AC) {
                return "É Escaleno\n\n";
            }
        }else{
            return "\n\nNão é possivel verificar pois os pontos são Co-lineares.\n\n";
        }
        
        return null;
    }
}

