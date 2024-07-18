package Classes;

public class Movel extends Produto {
    private String material;

    public Movel(int codigo, String nome, double preco, double custo, int estoque, String material) {
        super(codigo, nome, preco, custo, estoque);
        this.material = material;
    }

    @Override
    public double calcularCustoAdicional() {
        double custoAdicional = super.calcularCustoAdicional();
        if (material.equalsIgnoreCase("madeira maciça")) {
            // Aumento de 20% para madeira maciça
            custoAdicional += custo * 0.20; 
        } else {
            // Aumento de 5% para outros materiais
            custoAdicional += custo * 0.05; 
        }
        return custoAdicional;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Material: " + material);
    }

    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
