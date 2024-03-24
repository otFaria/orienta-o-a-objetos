package classes;

import java.util.Objects;

public class Professor {
    private String Nome;
    private char Sexo;
    private int Idade;
    private String CPF;

    public Professor(){
        this.Nome = " ";
        this.Sexo = ' ';
        this.Idade = 0;
        this.CPF = " ";
    }

    public Professor(String Nome, char Sexo, int Idade, String CPF) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.CPF = CPF;
    }
    
    public void Copia(Professor A1){
        this.Nome = A1.getNome();
        this.Sexo = A1.getSexo();
        this.Idade = A1.getIdade();
        this.CPF = A1.getCPF();
    }
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        String Texto = "\nNome:  " + this.Nome + "\nSexo: " + this.Sexo + "\nIdade: " + this.Idade + "\nCPF: " + this.CPF;
        return Texto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.CPF);
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
        final Professor other = (Professor) obj;
        if (this.Sexo != other.Sexo) {
            return false;
        }
        if (this.Idade != other.Idade) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return Objects.equals(this.CPF, other.CPF);
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
    
}
