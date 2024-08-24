package TableModel;

import classes.Disciplina;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMDisciplina extends AbstractTableModel{

    private List<Disciplina> disciplinas;
    
    private final int COL_NOME = 0;
    private final int COL_SEMESTRE = 1;
    private final int COL_HORARIO = 2;
    private final int COL_PROFESSOR = 3;
    private final int COL_ALUNO = 4;
    
    public TMDisciplina(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }
    
    @Override
    public int getRowCount() {
       return this.disciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Disciplina P1 = disciplinas.get(row);
        
        switch (col) {
            case COL_NOME:
                return P1.getNome();
                
            case COL_SEMESTRE:
                return P1.getSemestre();
                
            case COL_HORARIO:
                return P1.getHora();
                
            case COL_PROFESSOR:
                return P1.getMinistrante().toString();
                
            case COL_ALUNO:
                return P1.getAlunos().toString();
                
            default:
                break;
        }
        
        return "-";
    }
    
    @Override
    public String getColumnName(int col){
        switch (col) {
            case COL_NOME:
                return "NOME";
                
            case COL_SEMESTRE:
                return "SEMESTRE";
                
            case COL_HORARIO:
                return "HORARIO";
                
            case COL_PROFESSOR:
                return "PROFESSORES";
                
            case COL_ALUNO:
                return "ALUNO";
                
            default:
                break;
        }
        
        return "-";
    }
}
