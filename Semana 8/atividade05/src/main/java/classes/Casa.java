package classes;
public class Casa {
    private int id;
    private String tipo;
    private int quartos;
    private int banheiros;
    private int area;
    private Double preco;

    public Casa() {
        this.id = 0;
        this.tipo = "";
        this.quartos = 0;
        this.banheiros = 0;
        this.area = 0;
        this.preco = 0.0;
    }

    public Casa(int id, String tipo, int quartos, int banheiros, int area, Double preco) {
        this.id = id;
        this.tipo = tipo;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.area = area;
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
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
        final Casa other = (Casa) obj;
        return this.id == other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nId = " + id + ", Tipo = " + tipo + ", Quartos = " + quartos + ", Banheiros = " + banheiros + ", Area = " + area + ", Preco = " + preco;
    }    
}