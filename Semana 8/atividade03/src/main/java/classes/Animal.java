package classes;
public class Animal {
    
    private int cod;
    private String especie;
    private String raca;
    private Double peso;
    private int idade;

    public Animal() {
        this.cod = 0;
        this.especie = "";
        this.raca = "";
        this.peso = 0.0;
        this.idade = 0;
    }

    public Animal(int cod, String especie, String raca, Double peso, int idade) {
        this.cod = cod;
        this.especie = especie;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.cod;
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
        final Animal other = (Animal) obj;
        return this.cod == other.cod;
    }

    @Override
    public String toString() {
        return "\nCodigo = " + cod + ", Especie = " + especie + ", Raca = " + raca + ", Peso = " + peso + ", Idade = " + idade;
    }
}