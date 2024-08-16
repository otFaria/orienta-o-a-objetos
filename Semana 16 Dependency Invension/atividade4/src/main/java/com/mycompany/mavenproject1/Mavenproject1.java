package com.mycompany.mavenproject1;
import interfaces.IConversorMoeda;
import classes.Real_Para_Dolar;
import classes.ServicoFinanceiro;

public class Mavenproject1 {

    public static void main(String[] args) {
        IConversorMoeda cm_real = new Real_Para_Dolar();
        ServicoFinanceiro F1 = new ServicoFinanceiro(cm_real);
        
        F1.RealizarTransacao(2000);
    }
}
