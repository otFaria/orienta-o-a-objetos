package com.mycompany.mavenproject1;

import Interfaces.ILogStorage;
import classes.ArquivoLogStorage;
import classes.ConsoleLogStorage;
import classes.ServicoLog;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in);
        ILogStorage ls = new ArquivoLogStorage();
        ServicoLog sl = new ServicoLog(ls);
        String mensagem_erro = "";
        
        System.out.println("Me informe a menssagem de erro a ser adiconada: ");
        mensagem_erro = f.nextLine();
        
        sl.Registra_Log(mensagem_erro + ";\n");
    }
}
