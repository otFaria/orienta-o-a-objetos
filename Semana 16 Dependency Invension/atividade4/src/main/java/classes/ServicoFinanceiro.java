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
public class ServicoFinanceiro {
    
    private IConversorMoeda cm;

    public ServicoFinanceiro(IConversorMoeda cm) {
        this.cm = cm;
    }
    
    public void RealizarTransacao(double valor){
        
        this.cm.Converter(valor);
    }
}