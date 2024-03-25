package classes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Transacao {
    
    private int ID_Transacao;
    private String Tipo;
    private double Valor;
    private String Data;
    private int ContaAssociada;

    public Transacao() {
        this.ID_Transacao = 0;
        this.Tipo = " ";
        this.Valor = 0.0;
        this.Data = " ";
        this.ContaAssociada = 0;
    }

    public Transacao(int ID_Transacao, String Tipo, double Valor, String Data, int ContaAssociada) {
        this.ID_Transacao = ID_Transacao;
        this.Tipo = Tipo;
        this.Valor = Valor;
        this.Data = Data;
        this.ContaAssociada = ContaAssociada;
    }

    public static String dataHoraAtual(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        
        DateTimeFormatter Formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String DataEHoraFormtada = dataHoraAtual.format(Formato);
        return DataEHoraFormtada;
    }

    @Override
    public String toString() {
        return "\n\nID_Transacao = " + this.ID_Transacao + "\nTipo = " + this.Tipo + "\nValor = " + this.Valor + "\nData = " + this.Data + "\nContaAssociada = " + this.ContaAssociada + "\n\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.ID_Transacao;
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
        final Transacao other = (Transacao) obj;
        if (this.ID_Transacao != other.ID_Transacao) {
            return false;
        }
        if (Double.doubleToLongBits(this.Valor) != Double.doubleToLongBits(other.Valor)) {
            return false;
        }
        if (this.ContaAssociada != other.ContaAssociada) {
            return false;
        }
        if (!Objects.equals(this.Tipo, other.Tipo)) {
            return false;
        }
        return Objects.equals(this.Data, other.Data);
    }
    
    

    public int getID_Transacao() {
        return ID_Transacao;
    }

    public void setID_Transacao(int ID_Transacao) {
        this.ID_Transacao = ID_Transacao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public int getContaAssociada() {
        return ContaAssociada;
    }

    public void setContaAssociada(int ContaAssociada) {
        this.ContaAssociada = ContaAssociada;
    }
}
