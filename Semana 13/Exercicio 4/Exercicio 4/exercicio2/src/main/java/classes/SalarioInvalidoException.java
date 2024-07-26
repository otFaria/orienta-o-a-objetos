package Classes;

//Usei exception pois da para indentificar que está ocorrendo algum tratamento na main
public class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String message) {
        super(message);
    }
}
