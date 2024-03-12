package classe;

public class Ponto{
   private double X;
   private double Y;
   
   public Ponto(){
       this.X = 0;
       this.Y = 0;
    }

    public Ponto(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
   
   public Ponto(Ponto P1){
        this.X = P1.getX();
        this.Y = P1.getY();
    }
   
   public double DistanciaEntrePontos(Ponto A){
       double X = A.getX() - this.X;
       double Y = A.getY() - this.Y;
       
       Y = Math.pow(Y, 2);
       X = Math.pow(X, 2);
       
       double Soma = X + Y;
       
       double Distancia = Math.sqrt(Soma);
       
       return Distancia;
    }
   
  
   
   
   
   @Override
   public String toString(){
       String Texto = "Cordenada X: " + this.X + "\nCordenada Y: " + this.Y; 
      return Texto;
    }    
   
   
   
   
   
   
   
   
   //getters and setters
    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
}
