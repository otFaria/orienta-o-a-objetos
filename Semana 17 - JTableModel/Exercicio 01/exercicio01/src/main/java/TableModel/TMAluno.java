package TableModel;
import classes.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMAluno extends AbstractTableModel{
    
    List<Aluno> alunos = new ArrayList<>();
    private final int COL_CPF = 0;
    private final int COL_MATRICULA = 1;
    private final int COL_NOME = 2;
    private final int COL_SEXO = 3;
    private final int COL_IDADE = 4;
    private final int COL_ANOINGRESSO = 5;
            
    public TMAluno(List<Aluno> alunos){
        this.alunos = alunos;
    }
    @Override
    public int getRowCount() {
        return alunos.size();
    }
   
    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        
        switch(column){
            
            case COL_CPF:
                 return "CPF";   
                 
            case COL_ANOINGRESSO:
                return "ANO DE INGRESSO";
                
            case COL_IDADE:
                return "IDADE";
             
            case COL_MATRICULA:
                return "MATRICULA";
                
            case COL_NOME:
                return "NOME";
                
            case COL_SEXO:
                return "SEXO";
        }
        
        return "";
    }
    
    

    @Override
    public Object getValueAt(int row, int col) {
        
        Aluno aluno = alunos.get(row);
        
        if(col == COL_CPF){
            return aluno.getCpf();
        }else if (col == COL_MATRICULA){
            return aluno.getMatricula();
        }else if (col == COL_NOME){
            return aluno.getNome();
        }else if(col == COL_IDADE){
            return aluno.getIdade();
        }else if(col == COL_ANOINGRESSO){
            return aluno.getAno_ingresso();
        }else if (col == COL_SEXO){
            return aluno.getSexo();
        }
        
        return "";
    }
}