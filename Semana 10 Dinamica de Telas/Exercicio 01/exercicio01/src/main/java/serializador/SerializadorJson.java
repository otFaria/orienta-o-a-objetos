/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializador;

import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class SerializadorJson {
    
    //Professores
    
    public String toJson_Professor(List<Professor> professores) throws JsonProcessingException{
        try {
            ObjectMapper maper = new ObjectMapper();
            String json_string = maper.writeValueAsString(professores);
            return json_string;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Professor> fromJson_Professores(String json_string){
        try {
            ObjectMapper maper = new ObjectMapper();
            List<Professor> professores = maper.readValue(json_string, new TypeReference<List<Professor>>(){});
            return professores;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //Aluno
    
    public String toJson_Aluno(List<Aluno> alunos) {
        try {
            ObjectMapper maper = new ObjectMapper();
            String json_string = maper.writeValueAsString(alunos);
            return json_string;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Aluno> fromJson_alunos(String json_string){
        try {
            ObjectMapper maper = new ObjectMapper();
            List<Aluno> alunos = maper.readValue(json_string, new TypeReference<List<Aluno>>(){});
            return alunos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //Disciplina
    
    public String toJson_Disciplina(List<Disciplina> disciplinas) throws JsonProcessingException{
        try {
            ObjectMapper maper = new ObjectMapper();
            String json_string = maper.writeValueAsString(disciplinas);
            return json_string;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Disciplina> fromJson_Disciplina(String json_string){
        try {
            ObjectMapper maper = new ObjectMapper();
            List<Disciplina> disciplinas = maper.readValue(json_string, new TypeReference<List<Disciplina>>(){});
            return disciplinas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}