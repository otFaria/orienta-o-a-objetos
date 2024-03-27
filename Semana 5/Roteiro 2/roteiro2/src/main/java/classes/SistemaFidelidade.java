package classes;
public class SistemaFidelidade {
    
    private int pontos;

    public SistemaFidelidade() {
        this.pontos = 0; 
    }
    
    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;
        }
    }
    
    public void Remover_Pontos(int Qtd){
        this.pontos -= Qtd;
    }
    
    public int getSaldoPontos() {
        return pontos;
    }
    
    
    public boolean resgatarPontos(int pontosParaResgate) {
        if (pontosParaResgate <= 0 || pontosParaResgate > this.pontos) {
            return false;
            
        } else {
            
            this.pontos -= pontosParaResgate;
            return true;
        }
    }

    @Override
    public String toString() {
        return "\nPontos = " + this.pontos;
    }
    
    
}