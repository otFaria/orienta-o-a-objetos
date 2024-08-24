package TableModel;
import classes.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMProfessor extends AbstractTableModel{
    
    List<Professor> professores = new ArrayList<>();
    
    private final int COL_CPF = 0;
    private final int COL_NOME = 1;
    private final int COL_SEXO = 2;
    private final int COL_IDADE = 3;
    
    public TMProfessor(List<Professor> professores){
        this.professores = professores;
    }

    @Override
    public int getRowCount() {
       return professores.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        
        switch(column){
            
            case COL_CPF:
                return "CPF";
            
            case COL_NOME: 
                return "NOME";
                
            case COL_SEXO:
                return "SEXO";
            
            case COL_IDADE:
                return "IDADE";
                
            default:
                break;
        }
        return "";
    }

    @Override
    public Object getValueAt(int row, int col) {
        Professor professor = this.professores.get(row);
        
        if (col == COL_CPF) {
            return professor.getCpf();
        }else if(col == COL_NOME){
            return professor.getNome();
        }else if(col == COL_IDADE){
            return professor.getIdade();
        }else if(col == COL_SEXO){
            return professor.getSexo();
        }
        
        return "-";
    }
}
