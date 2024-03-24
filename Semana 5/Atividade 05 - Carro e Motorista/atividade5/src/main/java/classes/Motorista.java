package classes;
public class Motorista {
    private String Nome;
    private Carro carro;

    public Motorista() {
        this.Nome = " ";
        this.carro = new Carro();
    }

    public Motorista(String Nome, Carro carro) {
        this.Nome = Nome;
        this.carro = carro;
    }
    
    public void Copia(Motorista M1){
        this.Nome = M1.getNome();
        this.carro = M1.getCarro();
    }
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        String Texto = "\nMotorista: " + this.Nome + "\nCarro: " + this.carro;
        return Texto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
    
}
