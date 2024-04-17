package classes;
public class Carro {
    
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private Double preco;

    public Carro(){
        this.id = 0;
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.preco = 0.0;
    }

    public Carro(int id , String marca, String modelo, int ano, Double preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Carro other = (Carro) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "\nID = " + id + ", Marca = " + marca + ", Modelo = " + modelo + ", Ano = " + ano + ", Preco = " + preco;
    }
}
