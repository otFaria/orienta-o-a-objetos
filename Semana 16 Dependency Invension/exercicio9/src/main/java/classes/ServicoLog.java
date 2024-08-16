package classes;

import Interfaces.ILogStorage;

public class ServicoLog {
    private ILogStorage ls;

    public ServicoLog(ILogStorage ls) {
        this.ls = ls;
    }
    
    public void Registra_Log(String Menssagem){
        ls.Armazenar(Menssagem);
    }
}
