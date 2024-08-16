package classes;

import interfaces.IConversorMoeda;

public class Dolar_Para_Real implements IConversorMoeda{
    
    private double valor_cotacao_real = 5.48;
    
    @Override
    public void Converter(double valor){
        
        double valor_convertido = 0.0;
        
        valor_convertido = valor * valor_cotacao_real;
        
        System.out.println("Fazendo a cotação de dolar para real com o seu valor de " + valor + " o valor cotado deu: " + valor_convertido);
    } 
}
