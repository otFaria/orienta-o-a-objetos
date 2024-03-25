package classes;

import java.util.Objects;

public class Aluno {
    
    private String Nome;
    private char sexo;
    private int Idade;
    private String CPF;
    private String Matricula;
    private int AnoDeIngresso;

    public Aluno(){
        this.Nome = " ";
        this.sexo = ' ';
        this.Idade = 0;
        this.CPF = " ";
        this.Matricula = " ";
        this.AnoDeIngresso = 0;
    }

    public Aluno(String Nome, char sexo, int Idade, String CPF, String Matricula, int AnoDeIngresso) {
        this.Nome = Nome;
        this.sexo = sexo;
        this.Idade = Idade;
        this.CPF = CPF;
        this.Matricula = Matricula;
        this.AnoDeIngresso = AnoDeIngresso;
    }
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    public void Copiar(Aluno A1){
        this.Nome = A1.getNome();
        this.sexo = A1.getSexo();
        this.Idade = A1.getIdade();
        this.CPF = A1.getCPF();
        this.Matricula = A1.getMatricula();
        this.AnoDeIngresso = A1.getAnoDeIngresso();
    }
    
    @Override
    public String toString(){
        String Texto = "\nNome:  " + this.Nome + "\nSexo: " + this.sexo + "\nIdade: " + this.Idade + "\nCPF: " + this.CPF + "\nMatricula: " + this.Matricula + "\nAno de Ingresso: " + this.AnoDeIngresso;
        return Texto;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.CPF);
        hash = 19 * hash + Objects.hashCode(this.Matricula);
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
        final Aluno other = (Aluno) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.Idade != other.Idade) {
            return false;
        }
        if (this.AnoDeIngresso != other.AnoDeIngresso) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.Matricula, other.Matricula);
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getAnoDeIngresso() {
        return AnoDeIngresso;
    }

    public void setAnoDeIngresso(int AnoDeIngresso) {
        this.AnoDeIngresso = AnoDeIngresso;
    }
    
    
    
}
