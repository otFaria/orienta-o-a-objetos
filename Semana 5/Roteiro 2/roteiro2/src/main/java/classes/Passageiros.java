package classes;

import java.util.Objects;

public class Passageiros {
    private String CPF;
    private SistemaFidelidade Pontos;

    public Passageiros() {
        this.CPF = " ";
        this.Pontos = new SistemaFidelidade();
    }

    public Passageiros(String CPF, SistemaFidelidade Pontos) {
        this.CPF = CPF;
        this.Pontos = Pontos;
    }

    @Override
    public String toString() {
        return "\nCPF = " + this.CPF + "\nPontos = " + this.Pontos + "\n\n";
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.CPF);
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
        final Passageiros other = (Passageiros) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.Pontos, other.Pontos);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public SistemaFidelidade getPontos() {
        return Pontos;
    }

    public void setPontos(SistemaFidelidade Pontos) {
        this.Pontos = Pontos;
    }
    
    
}
