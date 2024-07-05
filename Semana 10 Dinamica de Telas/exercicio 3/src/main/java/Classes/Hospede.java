/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author USUARIO
 */
public class Hospede {
    // Atributos
    private String nome;
    private String documentoIdentidade; // Pode ser CPF ou passaporte
    private String contato;
    private String endereco;

    // Construtor
    public Hospede(String nome, String documentoIdentidade, String contato, String endereco) {
        this.nome = nome;
        this.documentoIdentidade = documentoIdentidade;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Hospede() {
    }
    
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoIdentidade() {
        return documentoIdentidade;
    }

    public void setDocumentoIdentidade(String documentoIdentidade) {
        this.documentoIdentidade = documentoIdentidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método toString para representação textual do objeto
    @Override
    public String toString() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                ", documentoIdentidade='" + documentoIdentidade + '\'' +
                ", contato='" + contato + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    // Exemplo de método adicional para alguma funcionalidade específica
    

  
}

