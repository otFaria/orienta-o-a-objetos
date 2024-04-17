package com.mycompany.atividade01;

import classes.GerenciadorMusica;
import classes.Musica;
import com.mycompany.atividade01.gui.JFCadMusica;
import java.io.IOException;

public class Atividade01 {
    
    public static void TesteSerializador() throws IOException{
        
        //Criando o Gerenciador de Musica
        GerenciadorMusica gerente = new GerenciadorMusica();
        
        //Criando as musicas para serem adicionadas na lista de musicas dentro do gerenciador.
        Musica M1 = new Musica(0, "Cabeça de gelo", "Cleiton Rasta", 235 , 9999.0);
        Musica M2 = new Musica(2, "Bambu gemendo", "Gilson e seus teclados", 324 , 500.9);
        
        //Adicionando ao Gerenciador
        gerente.adicionarMusica(M1);
        gerente.adicionarMusica(M2);
        
        //Salvando no arquivo em formato CSV
        gerente.salvarNoArquivo("Teste.txt");
        
        //Removendo a musica para efetuar os testes
        gerente.removerMusica(0);
        gerente.removerMusica(2);
        
        //Teste 1: Verificar que a lista está vazia.
        System.out.print("Teste 1: ");
        System.out.println(gerente.toString());
        
        //Pegando os dados do arquivo "Teste.txt" aonde colocamos os dados das musicas em formato CSV.
        gerente.loadDoArquivo("Teste.txt");
        
        //Imprimindo a lista de musicas com os dados da musica lá dentro.
        System.out.println("Teste 2: ");
        System.out.println(gerente.toString());
    }

    public static void main(String[] args) throws IOException {
        TesteSerializador();
    }
}
