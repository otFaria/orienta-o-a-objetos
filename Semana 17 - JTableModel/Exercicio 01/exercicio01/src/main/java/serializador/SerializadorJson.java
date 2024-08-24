package serializador;

import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class SerializadorJson {
    
    // Professores
    public String toJsonProfessor(List<Professor> professores) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(professores);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Professor> fromJsonProfessores(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonString, new TypeReference<List<Professor>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Aluno
    public String toJsonAluno(List<Aluno> alunos) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(alunos);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Aluno> fromJsonAlunos(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonString, new TypeReference<List<Aluno>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Disciplina
    public String toJsonDisciplina(List<Disciplina> disciplinas) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(disciplinas);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Disciplina> fromJsonDisciplina(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonString, new TypeReference<List<Disciplina>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}