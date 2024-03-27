package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aeroporto {
   private String Nome;
   private String Localizacao;
   private List<Voo> voos;

    public Aeroporto() {
        this.Nome = " ";
        this.Localizacao = " ";
        this.voos = new ArrayList<>();
    }

    public Aeroporto(String Nome, String Localizacao, List<Voo> voos) {
        this.Nome = Nome;
        this.Localizacao = Localizacao;
        this.voos = voos;
    }
    
    public int Verifica_Se_Existe_Voo(int Num_Voo){
        
        for (int i = 0; i < voos.size(); i++){
            if(voos.get(i).getNumero_Voo() == Num_Voo)
                return i;
            else
                return -1;
        }
        return -1;
    }
    
    public void Adicionar_Voo(Voo V1){
        int Index = Verifica_Se_Existe_Voo(V1.getNumero_Voo());
        if (Index == -1){
            voos.add(V1);
            System.out.println("\nVoo Adicionado com Sucesso.");
        }else
            System.out.println("\nJa existe um voo com este numero.");
    }
    
    public void Remover_Voo(int Num_Voo){
        int Index = Verifica_Se_Existe_Voo(Num_Voo);
        if (Index != -1){
            voos.remove(Index);
            System.out.println("\nVoo Removido com Sucesso.");
        }else
            System.out.println("\nNumero do voo invalido.");
    }
    
    public void Listar_Voo(){
        System.out.println(voos);
    }
    
    public void Autorizar_Voo(int Num_Voo){
        int Index = Verifica_Se_Existe_Voo(Num_Voo);
        if (Index != -1){
            System.out.println("O Voo de Numero " + Num_Voo + ", esta autorizado a decolar.");
        }else
            System.out.println("\nO Numero do voo é invalido.");
    }

    @Override
    public String toString() {
        return "\nNome = " + this.Nome + "\nLocalização = " + this.Localizacao + "\nVôos = " + this.voos + "\n\n";
    }
    
    public List<Voo> Voo_Com_Prejuizo(){
        List<Voo> voos_Com_Prejuizo = new ArrayList<>();
        
        for (int i = 0; i < voos.size(); i++) {
            if (voos.get(i).Verificar_Voo_Com_Prejuizo()) {
                voos_Com_Prejuizo.add(voos.get(i));
            }
        }
        
        return voos_Com_Prejuizo;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Nome);
        hash = 97 * hash + Objects.hashCode(this.Localizacao);
        hash = 97 * hash + Objects.hashCode(this.voos);
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
        final Aeroporto other = (Aeroporto) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.Localizacao, other.Localizacao)) {
            return false;
        }
        return Objects.equals(this.voos, other.voos);
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    
    
    
}
