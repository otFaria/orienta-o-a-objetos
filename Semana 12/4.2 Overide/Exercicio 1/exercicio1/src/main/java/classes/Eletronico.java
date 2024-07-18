package Classes;

public class Eletronico extends Produto {
    private int consumoEnergia;

    public Eletronico(int codigo, String nome, double preco, double custo, int estoque, int consumoEnergia) {
        super(codigo, nome, preco, custo, estoque);
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public double calcularDesconto(double percentual) {
        double descontoBase = super.calcularDesconto(percentual);
        // Desconto adicional de 7%
        return descontoBase * 0.93; 
    }

    @Override
    public double calcularCustoAdicional() {
        double custoAdicional = super.calcularCustoAdicional();
        if (consumoEnergia > 500) {
            // Aumento de 10% para alto consumo de energia
            custoAdicional += custo * 0.10; 
        }
        return custoAdicional;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Consumo de Energia: " + consumoEnergia + "W");
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
}
