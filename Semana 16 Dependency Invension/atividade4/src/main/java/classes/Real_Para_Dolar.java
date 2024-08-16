/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IConversorMoeda;

/**
 *
 * @author Otavio
 */
public class Real_Para_Dolar implements IConversorMoeda{
     
    private double valor_cotacao_dolar = 0.18;
    
    @Override
    public void Converter(double valor){
        
        double valor_convertido = 0.0;
        
        valor_convertido = valor * valor_cotacao_dolar;
        
        System.out.println("Fazendo a cotação de real para dolar, com o seu valor de " + valor + " o valor cotado deu: " + valor_convertido);
    } 
}