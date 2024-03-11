package classes;
import java.util.Scanner;

public class Reserva {
    private String NomeReserva;
    private int NumeroDePessoas;
    private int Hora;
    private int Minutos;
    private int Dia;
    private int Mes;
    private int Ano;

    public Reserva() {
        this.NomeReserva = " ";
        this.NumeroDePessoas = 0;
        this.Hora = 0;
        this.Minutos = 0;
        this.Dia = 0;
        this.Mes = 0;
        this.Ano = 0;
    }
    
    public Reserva(String NomeReserva, int NumeroDePessoas, int Hora, int Minutos, int Dia, int Mes, int Ano) {
        this.NomeReserva = NomeReserva;
        this.NumeroDePessoas = NumeroDePessoas;
        this.Hora = Hora;
        this.Minutos = Minutos;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
    }
    
    //Preencher
    public void Preencher(){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Preencha os dados abaixo para efetuar uma reserva.");
        
        //Dados
            System.out.print("\n\nNome Da Reserva: ");
            this.NomeReserva = ler.next();
            System.out.print("\nNumero De Pessoas: ");
            this.NumeroDePessoas = ler.nextInt();
        
        //Horario
            System.out.print("\n\nHorario: ");
            System.out.print("\nHora: ");
            this.Hora = ler.nextInt();
            System.out.print("\nMinutos: ");
            this.Minutos = ler.nextInt();
        
        
        //Data
            System.out.print("\n\nData: ");
            System.out.print("\nDia: ");
            this.Dia = ler.nextInt();
            System.out.print("\nMes: ");
            this.Mes = ler.nextInt();
            System.out.print("\nAno: ");
            this.Ano = ler.nextInt();
    }
    //
    
    //Copiar
    
    public void Copia(Reserva L1){
        this.NomeReserva = L1.getNomeReserva();
        this.NumeroDePessoas = L1.getNumeroDePessoas();
        this.Hora = L1.Hora;
        this.Minutos = L1.Minutos;
        this.Dia = L1.Dia;
        this.Mes = L1.Mes;
        this.Ano = L1.Ano;
    }

    @Override
    public String toString(){
        String Texto = "\n\nNome da reserva: " + this.NomeReserva + "\nNumero de pessoas: " + this.NumeroDePessoas + "\nHorario: " + this.Hora + ":" + this.Minutos + "\nData: " + this.Dia + "/" + this.Mes + "/" + this.Ano;
        return Texto;
    }
  
    //Getters

    public String getNomeReserva() {
        return NomeReserva;
    }

    public int getNumeroDePessoas() {
        return NumeroDePessoas;
    }

    public int getHora() {
        return Hora;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAno() {
        return Ano;
    }
    
    //
    
    //Setters

    public void setNomeReserva(String NomeReserva) {
        this.NomeReserva = NomeReserva;
    }

    public void setNumeroDePessoas(int NumeroDePessoas) {
        this.NumeroDePessoas = NumeroDePessoas;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    
    //
}
