package classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class GerenciamentoDeReserva {
    
    private List<Reserva> ListaDeReservas;

    public GerenciamentoDeReserva(){
        ListaDeReservas = new ArrayList<>();
    }
    
    public void Inserir(){
        Reserva R1 = new Reserva();
        R1.Preencher();
        ListaDeReservas.add(R1);
    }

    public void ImprimirLista() {
        if(ListaDeReservas.isEmpty()){
            System.out.println("\n\nLista esta vazia.");
        }else{
            for (int i = 0; i < ListaDeReservas.size(); i++) {
                Reserva R2 = ListaDeReservas.get(i);
                System.out.println(R2.toString());
            }
        }
    }
    
    public void RemoverLista(){
        
        int index = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("\nEscolha o indice para remover.");
        System.out.print("Indice: ");
        index = ler.nextInt();
        
        if(ListaDeReservas.isEmpty()){
            System.out.println("\nNao a nada para remover.");
        }else if(index < ListaDeReservas.size()){
            ListaDeReservas.remove(index);
        }else{
            System.out.println("Index invalido.");
        }
    }
    
    public void Pesquisar(){
        String Nome = " ";
        Scanner ler = new Scanner(System.in);
        System.out.println("ATENCAO: DEVERIA SER PESQUISADO POR ID, MAIS NAO FOI EMPLEMENTADO");
        System.out.print("\nMe informe o nome para ser pesquisado: ");
        Nome = ler.next();
        boolean Procurado = false;
        
        for(Reserva R1 : ListaDeReservas){
            if(Nome.equals(R1.getNomeReserva())){
                System.out.println("Reserva Encontrada com sucesso.");
                System.out.println(R1.toString());
                Procurado = true;
            }
        }
        if(!Procurado){
            System.out.println("Nao foi encontrado nem uma reserva.");
        }
    }
}
