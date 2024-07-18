package Classes;

public class Perecivel extends Produto {
    private int tempoParaVencer; // em dias

    public Perecivel(int codigo, String nome, double preco, double custo, int estoque, int tempoParaVencer) {
        super(codigo, nome, preco, custo, estoque);
        this.tempoParaVencer = tempoParaVencer;
    }

    @Override
    public double calcularCustoAdicional() {
        double custoAdicional = super.calcularCustoAdicional();
        if (tempoParaVencer < 30) {
            // Aumento de 20% para produtos próximos da validade
            custoAdicional += custo * 0.20; 
        }
        return custoAdicional;
    }

    @Override
    public boolean verificarEstoque() {
        return super.verificarEstoque() && tempoParaVencer > 0;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Tempo para Vencer: " + tempoParaVencer + " dias");
    }

    
    public int getTempoParaVencer() {
        return tempoParaVencer;
    }

    public void setTempoParaVencer(int tempoParaVencer) {
        this.tempoParaVencer = tempoParaVencer;
    }
}
