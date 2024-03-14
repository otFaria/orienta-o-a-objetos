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

        //Formula de Heron
        double Area = 0.0;

        double a, b, c, s;
        a = Math.sqrt(Math.pow(pontos[1].getX() - pontos[0].getX(), 2) + Math.pow(pontos[1].getY() - pontos[0].getY(), 2));
        b = Math.sqrt(Math.pow(pontos[2].getX() - pontos[1].getX(), 2) + Math.pow(pontos[2].getY() - pontos[1].getY(), 2));
        c = Math.sqrt(Math.pow(pontos[0].getX() - pontos[2].getX(), 2) + Math.pow(pontos[0].getY() - pontos[2].getY(), 2));

        s = ((a + b + c) / 2);

        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return Area;
    }

    public void Preencher() {
        System.out.println("Preencha abaixo os pontos.");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ponto " + (i + 1) + ": ");
            pontos[i].Preencher();
        }
    }

    public boolean VerificaColinear() {
        /*
        |x1 y1| = x1*y2 - y1*x2 = 0 São colineres != 0 não são colineares
        |x2 y2|
        |x3 y2|
         */
        double Determinante = pontos[0].getX() * (pontos[1].getY() - pontos[2].getY()) + pontos[1].getX() * (pontos[2].getY() - pontos[0].getY()) + pontos[2].getX() * (pontos[0].getY() - pontos[1].getY());

        if (Determinante == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean PerimetroDoTriangulo() {

        double Perimetro = 0.0;
        
        if(VerificaColinear()){
            Perimetro = pontos[0].DistanciaEntrePontos(pontos[1]) + pontos[1].DistanciaEntrePontos(pontos[2]) + pontos[2].DistanciaEntrePontos(pontos[0]);
            System.out.println("O perimetro do triangulo eh: " + Perimetro);
            return true;
        }else{
            System.out.println("Nao é um triangulo.");
            return false;
        }
        
    }

    public String Tipo() {
        if(!VerificaColinear()){
            if (pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[1].DistanciaEntrePontos(pontos[2]) && pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[0].DistanciaEntrePontos(pontos[2])) {
                return "O tringulo e equilatero.";

            } else if (pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[1].DistanciaEntrePontos(pontos[2]) || pontos[0].DistanciaEntrePontos(pontos[1]) == pontos[0].DistanciaEntrePontos(pontos[2]) || pontos[1].DistanciaEntrePontos(pontos[2]) == pontos[0].DistanciaEntrePontos(pontos[2])) {
                return "Eh Isosceles";

            }else if (pontos[0].DistanciaEntrePontos(pontos[1]) != pontos[1].DistanciaEntrePontos(pontos[2]) && pontos[0].DistanciaEntrePontos(pontos[1]) != pontos[0].DistanciaEntrePontos(pontos[2])) {
                return "Eh Escaleno";
            }
        }else{
            return "Nao eh possivel verificar pois os pontos sao Co-lineares.";
        }
        return null;
    }
}

