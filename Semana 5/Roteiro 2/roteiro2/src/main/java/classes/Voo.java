package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Voo {
    private int Numero_Voo;
    private String Destino;
    private int Capacidade_Max;
    private List<Passageiros> passageiros;
    private List<String> Escala_cidades;
    private String Estado_Do_Voo;

    public Voo(){
        this.Numero_Voo = 0;
        this.Destino = " ";
        this.Capacidade_Max = 0;
        this.passageiros = new ArrayList<>();
        this.Escala_cidades = new ArrayList<>();
        this.Estado_Do_Voo = " ";
    }

    public Voo(int Numero_Voo, String Destino, int Capacidade_Max, List<Passageiros> passageiros, List<String> Escala_cidades, String Estado_Do_Voo) {
        this.Numero_Voo = Numero_Voo;
        this.Destino = Destino;
        this.Capacidade_Max = Capacidade_Max;
        this.passageiros = passageiros;
        this.Escala_cidades = Escala_cidades;
        this.Estado_Do_Voo = Estado_Do_Voo;
    }
    
    public int Verifica_Se_Existe_Passageiro(String CPF){
        
        for (int i = 0; i < passageiros.size(); i++){
            if(passageiros.get(i).getCPF() == CPF)
                return i;
            else
                return -1;
        }
        return -1;
    }
    
    public int Verifica_Se_Existe_Escala(String Cidade){
        
        for (int i = 0; i < Escala_cidades.size(); i++){
            if(Escala_cidades.get(i).equalsIgnoreCase(Cidade))
                return i;
            else
                return -1;
        }
        return -1;
    }
    
    public void Adicionar_Passageiros(Passageiros P1){
        if (Capacidade_Max > passageiros.size()){
            
            int Index = Verifica_Se_Existe_Passageiro(P1.getCPF());
            if (Index == -1){
                P1.getPontos().adicionarPontos(5);
                passageiros.add(P1);
                System.out.println("\nPassageiro Adicionado com Sucesso.");
            }else
                System.out.println("\nJa existe um passageiro com este CPF.");
            
        }else{
            System.out.println("\nO Voo está lotado.");
        }
    }
    
    public void Remover_Passageiros(String CPF){
        int Index = Verifica_Se_Existe_Passageiro(CPF);
        if (Index != -1){
            passageiros.get(Index).getPontos().Remover_Pontos(5);
            passageiros.remove(Index);
            System.out.println("\nPassageiro Removido com Sucesso.");
        }else
            System.out.println("\nCPF invalido.");
    }
    
    public void Adicionar_Escala(String Cidade){
        int Index = Verifica_Se_Existe_Escala(Cidade);
        
        if (Index == -1){
            Escala_cidades.add(Cidade);
            System.out.println("\nCidade Adicionada com Sucesso na escala.");
        }else
            System.out.println("\nCidade já esta na escala.");
    }
    
    public void Remover_Escala(String Cidade){
        int Index = Verifica_Se_Existe_Escala(Cidade);
        
        if (Index != -1){
            Escala_cidades.remove(Index);
            System.out.println("\n " + Cidade + "Removida com Sucesso da escala do voo.");
        }else
            System.out.println("\nEsta Cidade não esta na Escala.");
    }
    
    public void Definir_Estado_Voo(String Estado){
        
        if(Estado.equalsIgnoreCase("Aguardando Decolagem"))
            this.Estado_Do_Voo = "Aguardando Decolagem";
        
        else if(Estado.equalsIgnoreCase("Voando"))
            this.Estado_Do_Voo = "Voando";
        
        else if(Estado.equalsIgnoreCase("Concluido"))
            this.Estado_Do_Voo = "Concluido";
        
        else
            System.out.println("Estado informado invalido.");
    }
    
    public boolean Verificar_Voo_Com_Prejuizo(){
        
        if (passageiros.size() < 5){
            return true;
        }
        
        return false;
    }
    
    public void Gerar_Pontos_Passageiros(){
        for (int i = 0; i < passageiros.size(); i++) {
            passageiros.get(i).getPontos().adicionarPontos(5);
        }
    }
    
    

    @Override
    public String toString() {
        return "\n Numero_Voo = " + this.Numero_Voo + "\nDestino = " + this.Destino + "\nCapacidade_Max = " + this.Capacidade_Max + "\npassageiros = " + this.passageiros + "\nEscala_cidades = " + this.Escala_cidades + "\nEstado_Do_Voo = " + this.Estado_Do_Voo + "\n\n";
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.Numero_Voo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voo other = (Voo) obj;
        if (this.Numero_Voo != other.Numero_Voo) {
            return false;
        }
        if (this.Capacidade_Max != other.Capacidade_Max) {
            return false;
        }
        if (!Objects.equals(this.Destino, other.Destino)) {
            return false;
        }
        if (!Objects.equals(this.Estado_Do_Voo, other.Estado_Do_Voo)) {
            return false;
        }
        if (!Objects.equals(this.passageiros, other.passageiros)) {
            return false;
        }
        return Objects.equals(this.Escala_cidades, other.Escala_cidades);
    }

    public int getNumero_Voo() {
        return Numero_Voo;
    }

    public void setNumero_Voo(int Numero_Voo) {
        this.Numero_Voo = Numero_Voo;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getCapacidade_Max() {
        return Capacidade_Max;
    }

    public void setCapacidade_Max(int Capacidade_Max) {
        this.Capacidade_Max = Capacidade_Max;
    }

    public List<Passageiros> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiros> passageiros) {
        this.passageiros = passageiros;
    }

    public List<String> getEscala_cidades() {
        return Escala_cidades;
    }

    public void setEscala_cidades(List<String> Escala_cidades) {
        this.Escala_cidades = Escala_cidades;
    }

    public String getEstado_Do_Voo() {
        return Estado_Do_Voo;
    }

    public void setEstado_Do_Voo(String Estado_Do_Voo) {
        this.Estado_Do_Voo = Estado_Do_Voo;
    }
    
    
}
