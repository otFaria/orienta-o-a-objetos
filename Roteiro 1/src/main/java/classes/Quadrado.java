package classes;
public class Quadrado {
    private Ponto[] pontos;
    
    public Quadrado(){
        this.pontos = new Ponto[4];
        for(int i = 0; i < 4;i++)
            this.pontos[i] = new Ponto();
    }
    
    public boolean verifica(Ponto p1, Ponto p2){
        if(p1.getX() == p2.getY() || p1.getY() == p2.getX())
            return true;
        else
            return false;
    }
    
    public void fill(){      
        System.out.println("Preencha os dados:");
        
        for(int i = 0; i < 4;i++){
            boolean resultado = true;
            do{
                System.out.println("Ponto " + (i+1) + ": ");
                this.pontos[i].Preencher();
                if(i == 1)
                    resultado = this.verifica(this.pontos[i], this.pontos[i-1]);
            }while(!resultado);
        }
    }
    
    public void area(){
        double base = Math.sqrt(Math.pow(pontos[1].getX() - pontos[0].getX(), 2) + Math.pow(pontos[1].getY() - pontos[0].getY(), 2));
        double altura = Math.sqrt(Math.pow(pontos[2].getX() - pontos[1].getX(), 2) + Math.pow(pontos[2].getY() - pontos[1].getY(), 2));
        double area = base * altura;
        
        System.out.println("Area= " + area + "m².");
    }
    
    public void tipos(){
        double l1 = Math.sqrt(Math.pow(pontos[1].getX() - pontos[0].getX(), 2) + Math.pow(pontos[1].getY() - pontos[0].getY(), 2));
        double l2 = Math.sqrt(Math.pow(pontos[2].getX() - pontos[1].getX(), 2) + Math.pow(pontos[2].getY() - pontos[1].getY(), 2));
        double l3 = Math.sqrt(Math.pow(pontos[3].getX() - pontos[2].getX(), 2) + Math.pow(pontos[3].getY() - pontos[2].getY(), 2));
        double l4 = Math.sqrt(Math.pow(pontos[0].getX() - pontos[3].getX(), 2) + Math.pow(pontos[0].getY() - pontos[3].getY(), 2));

        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
        if(l1 == l2 && l2 == l3 && l3 == l4 && l4 == l1)
            System.out.println("É um quadrado");
        else
            System.out.println("É um retangulo");
    }
    
    public void perimetro(){
        
        double l1 = Math.sqrt(Math.pow(pontos[1].getX() - pontos[0].getX(), 2) + Math.pow(pontos[1].getY() - pontos[0].getY(), 2));
        double l2 = Math.sqrt(Math.pow(pontos[2].getX() - pontos[1].getX(), 2) + Math.pow(pontos[2].getY() - pontos[1].getY(), 2));
        double l3 = Math.sqrt(Math.pow(pontos[3].getX() - pontos[2].getX(), 2) + Math.pow(pontos[3].getY() - pontos[2].getY(), 2));
        double l4 = Math.sqrt(Math.pow(pontos[0].getX() - pontos[3].getX(), 2) + Math.pow(pontos[0].getY() - pontos[3].getY(), 2));
        
        double perimetro = l1 + l2 + l3 + l4;
        
        System.out.println("Perimetro: " + perimetro);
    }
}
