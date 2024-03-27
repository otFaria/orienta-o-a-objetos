package com.mycompany.roteiro2;

import classes.Aeroporto;
import classes.Passageiros;
import classes.SistemaFidelidade;
import classes.Voo;
import java.util.ArrayList;
import java.util.List;

public class Roteiro2 {

    public static void main(String[] args) {
        
        Aeroporto A1 = new Aeroporto("Aeroporto_Vira_Copos", "Rua_Das_Acacias", new ArrayList<>());
        Voo V1 = new Voo(1, "Miami", 200, new ArrayList<>(), new ArrayList<>(), "Aguardando_Decolagem");
        Voo V2 = new Voo(2, "Miami", 200, new ArrayList<>(), new ArrayList<>(), "Aguardando_Decolagem");
        Voo V3 = new Voo(3, "Miami", 200, new ArrayList<>(), new ArrayList<>(), "Aguardando_Decolagem");
        Passageiros P1 = new Passageiros("123456789", new SistemaFidelidade());
        
        V1.Adicionar_Escala("Miami");
        V1.Adicionar_Escala("Orlando");
        
        V1.Adicionar_Passageiros(P1);
        
        A1.Adicionar_Voo(V1);
        A1.Adicionar_Voo(V2);
        A1.Adicionar_Voo(V3);
        
        A1.Autorizar_Voo(1);
        
        //Tentando remover um Passageiro com CPF Invalido.
        A1.getVoos().get(0).Remover_Passageiros("1234567899");
        
        //Automaticamente no sistema e adicionado 5 pontos ao passageiro assim  que ele é adicionado a um voo, e assim que ele é removido do voo é retirado os 5 pontos adicionados.
        System.out.println("\nPontos do Passageiro: " + A1.getVoos().get(0).getPassageiros().get(0).getPontos().getSaldoPontos());
        
        //removendo um Passageiro com CPF valido
        A1.getVoos().get(0).Remover_Passageiros("123456789");
        
        //Listar voos com prejuizos. 
        
        System.out.println("Voos com prejuizo: ");
        
        List<Voo> Voo_Prejuizo = A1.Voo_Com_Prejuizo();
        System.out.print("ID dos voos com prejuizo: "); 
        for (int i = 0; i < Voo_Prejuizo.size(); i++) {
            System.out.print(Voo_Prejuizo.get(i).getNumero_Voo() + ", ");
        }
    }
}
